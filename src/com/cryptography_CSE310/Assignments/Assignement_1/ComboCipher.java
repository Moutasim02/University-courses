package com.cryptography_CSE310.Assignments.Assignement_1;

public class ComboCipher {
    public static void main(String[] args) {
        // CaeserCipher encryption
        String plainText = "Cyber security is the application of " +
                "technologies, processes, and controls to protect " +
                "systems, networks, programs, devices, and data from " +
                "cyber-attacks";
        int secretKey = (1080415) % 36;
        String cipherText = CaeserCipher.encrypt(plainText, secretKey);
        System.out.println("\"CaeserCipher\" encrypted text: " + cipherText);

        // PlayfairCipher encryption
        String keyString = "Moutasim";
        String cipherText2 = PlayfairCipher.encrypt(cipherText, keyString);
        System.out.println("2nd Encryption \"PlayfairCipher\" encrypted text: " + cipherText2);

        // PlayfairCipher decryption
        String decryptedText2 = PlayfairCipher.decrypt(cipherText2, keyString);
        System.out.println("\"PlayfairCipher\" decrypted text: " + decryptedText2);

        // CaeserCipher decryption
        String decryptedText = CaeserCipher.decrypt(cipherText, secretKey);
        System.out.println("2nd Decryption \"CaeserCipher\" decrypted text: " + decryptedText);

    }
}