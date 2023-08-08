package com.cryptography_CSE310.Project;

public class AlgorithmTest {
    public static void main(String[] args) {
        String plainText = "1110110101101111011101010111010001100001011100110110100101101101";
        String[] keys = {"11101101", "11000010", "00110100", "00011100", "11111110"};
        CustomCipherAlgorithm encryption = new CustomCipherAlgorithm(keys);

        String encryptedText = encryption.encrypt(plainText);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = encryption.decrypt(encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);

    }
}

