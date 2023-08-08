package com.cryptography_CSE310.Project;

public class CustomCipherAlgorithm {
    private final String[] key;
    private static final int BLOCK_SIZE = 8;
    public int roundNumber = 1;
    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public CustomCipherAlgorithm(String[] key) {
        this.key = key;
    }

    public String encrypt(String plainText) {
        for (int i = 0; i < key.length; i++) {
            switch (i) {
                case 0 -> setText(encryptHelper(plainText, key[0]));
                case 1 -> setText(encryptHelper(text, key[1]));
                case 2 -> setText(encryptHelper(text, key[2]));
                case 3 -> setText(encryptHelper(text, key[3]));
                case 4 -> setText(encryptHelper(text, key[4]));
            }
        }
        return text;
    }

    private String encryptHelper(String text, String key) {
        StringBuilder encryptedText = new StringBuilder();
        int startIndex = 0;
        int endIndex = BLOCK_SIZE;

        while (startIndex < text.length()) {
            if (endIndex > text.length()) {
                endIndex = text.length();
            }
            String currentPlainTextBlock = text.substring(startIndex, endIndex);

            String reversedKey = reverseString(key);
            int firstSBoxNumber = Integer.parseInt(reversedKey, 2) % 10;
            int secondSBoxNumber = Integer.parseInt(key, 2) % 10;

            String sBoxOutput;
            sBoxOutput = SBox.applySBox(currentPlainTextBlock, firstSBoxNumber);
            sBoxOutput = SBox.applySBox(sBoxOutput, secondSBoxNumber);

            BitPermutation bitPermutation = new BitPermutation();
            String permutationOutput = bitPermutation.applyPermutation(sBoxOutput, roundNumber);
            String xorResult = CryptoUtils.xor(permutationOutput, key);

            encryptedText.append(xorResult);
            startIndex = endIndex;
            endIndex = endIndex + BLOCK_SIZE;
        }
        roundNumber++;
        return encryptedText.toString();
    }

    private String reverseString(String str) {
        char character;
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            reversed.insert(0, character);
        }
        return reversed.toString();
    }


    public String decrypt(String encryptedText) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = key.length - 1; i >= 0; i--) {
            switch (i) {
                case 0 -> decryptedText = decryptHelper(encryptedText, key[0]);
                case 1 -> decryptedText = decryptHelper(encryptedText, key[1]);
                case 2 -> decryptedText = decryptHelper(encryptedText, key[2]);
                case 3 -> decryptedText = decryptHelper(encryptedText, key[3]);
                case 4 -> decryptedText = decryptHelper(encryptedText, key[4]);
            }
        }
        return decryptedText.toString();
    }

    private StringBuilder decryptHelper(String text, String key) {
        StringBuilder decryptedText = new StringBuilder();
        int startIndex = 0;
        int endIndex = BLOCK_SIZE;
        roundNumber--;
        while (startIndex < text.length()) {
            if (endIndex > text.length()) {
                endIndex = text.length();
            }
            String currentCipherTextBlock = text.substring(startIndex, endIndex);
            String xorResult = CryptoUtils.xor(currentCipherTextBlock, key);

            BitPermutation bitPermutation = new BitPermutation();
            String inversePermutationOutput = bitPermutation.inversePermutation(xorResult, roundNumber);
            // Put it inside the secondsbox, and then first sbox to decrypt
            int firstKey = Integer.parseInt(key, 2) % 10;
            int secondKey = Integer.parseInt(reverseString(key), 2) % 10;

            String inverseSBoxOutput = SBox.applyInverseSBox(inversePermutationOutput, firstKey);
            inverseSBoxOutput = SBox.applyInverseSBox(inverseSBoxOutput, secondKey);

            decryptedText.append(inverseSBoxOutput);
            startIndex = endIndex;
            endIndex = endIndex + BLOCK_SIZE;
        }

        return decryptedText;
    }


}