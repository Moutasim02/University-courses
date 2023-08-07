package com.cryptography_CSE310.Project;

public class AlgorithmTest {
    public static void main(String[] args) {
        String plainText = "moutasimbillahomranelayoubi108041500";
        String key = "ADC2341CFE"; // Replace with your key
        CustomCipherAlgorithm encryption = new CustomCipherAlgorithm(key);

        String encryptedText = encryption.encrypt(plainText);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = encryption.decrypt(encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}

