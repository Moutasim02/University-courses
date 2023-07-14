package com.cryptography_CSE310.Assignments.Assignement_1;

public class CaeserCipherTest {
    public static void main(String[] args) {
        String plainText = "Cyber security is the application of " +
                "technologies, processes, and controls to protect " +
                "systems, networks, programs, devices, and data from " +
                "cyber-attacks";
        int secretKey = (1080415) % 36;
        String encrypted = CaeserCipher.encrypt(plainText, secretKey);
        System.out.println("\nEncryption: " + encrypted + "\n");
        String decrypted = CaeserCipher.decrypt(encrypted, secretKey);
        System.out.println("Decryption: " + decrypted);
    }
}
