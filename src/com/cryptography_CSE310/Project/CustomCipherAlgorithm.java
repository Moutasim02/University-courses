package com.cryptography_CSE310.Project;

import java.math.BigInteger;

public class CustomCipherAlgorithm {
    private final String key;
    private static final int BLOCK_SIZE = 8;

    public CustomCipherAlgorithm(String key) {
        this.key = hexToBinary(key);
    }

    private String hexToBinary(String hexKey) {
        String binaryKey = new BigInteger(hexKey, 16).toString(2);
        return String.format("%40s", binaryKey).replace(' ', '0');
    }

    private String getSubKey(int roundNumber) {
        int subKeySize = this.key.length() / 5;
        int startIndex = (roundNumber - 1) * subKeySize;
        int endIndex = startIndex + subKeySize;
        return this.key.substring(startIndex, endIndex);
    }

    private String textToBinary(String text) {
        StringBuilder binaryText = new StringBuilder();
        for (char c : text.toCharArray()) {
            String binaryChar = Integer.toBinaryString(c);
            binaryText.append(String.format("%8s", binaryChar).replace(' ', '0'));
        }
        return binaryText.toString();
    }

    private String binaryToText(String binary) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 8) {
            String binaryChar = binary.substring(i, i + 8);
            int charValue = Integer.parseInt(binaryChar, 2);
            text.append((char) charValue);
        }
        return text.toString();
    }

    public String encrypt(String plainText) {
        String binaryPlainText = textToBinary(plainText);

        StringBuilder encryptedText = new StringBuilder();
        int startIndex = 0;
        int endIndex = BLOCK_SIZE;

        for (int roundNumber = 1; roundNumber <= 5; roundNumber++) {
            String subKey = getSubKey(roundNumber);

            while (startIndex < plainText.length()) {
                if (endIndex > plainText.length()) {
                    endIndex = plainText.length();
                }
                String currentPlainTextBlock = binaryPlainText.substring(startIndex, endIndex);

                String sBoxOutput = SBox.sBoxTables(currentPlainTextBlock, subKey);
                String permutationOutput = BitPermutation.permutation(sBoxOutput);
                String xorResult = CryptoUtils.xor(permutationOutput, subKey);

                encryptedText.append(xorResult);
                startIndex = endIndex;
                endIndex = endIndex + BLOCK_SIZE;
            }

            startIndex = 0;
            endIndex = BLOCK_SIZE;
        }
        return encryptedText.toString();
    }

    public String decrypt(String encryptedText) {
        StringBuilder binaryPlainText = new StringBuilder();
        int startIndex = 0;
        int endIndex = BLOCK_SIZE;

        for (int roundNumber = 5; roundNumber >= 1; roundNumber--) {
            String subKey = getSubKey(roundNumber);

            while (startIndex < encryptedText.length()) {
                if (endIndex > encryptedText.length()) {
                    endIndex = encryptedText.length();
                }
                String currentCipherTextBlock = encryptedText.substring(startIndex, endIndex);
                String inverseXORResult = CryptoUtils.xor(currentCipherTextBlock, subKey);
                String inversePermutationOutput = BitPermutation.inversePermutation(inverseXORResult);
                String inverseSBoxOutput = SBox.inverseSBoxTables(inversePermutationOutput, subKey);
                binaryPlainText.append(inverseSBoxOutput);
                startIndex = endIndex;
                endIndex = endIndex + BLOCK_SIZE;
            }

            startIndex = 0;
            endIndex = BLOCK_SIZE;
        }
        return binaryToText(binaryPlainText.toString());
    }

}

