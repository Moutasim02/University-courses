package com.cryptography_CSE310.Assignments.Assignement_1;

public class PlayfairCipherTest {
    public static void main(String[] args) {
        String plainText = "Cyber security is the application of " +
                "technologies, processes, and controls to protect " +
                "systems, networks, programs, devices, and data from " +
                "cyber-attacks";
        String secretKey = "Moutasim";
        String encrypted = PlayfairCipher.encrypt(plainText, secretKey);
        System.out.println("\nEncryption: " + encrypted + "\n");
        String decrypted = PlayfairCipher.decrypt(encrypted,secretKey);
        System.out.println("Decryption: " + decrypted);
    }
}
