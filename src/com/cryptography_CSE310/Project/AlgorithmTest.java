package com.cryptography_CSE310.Project;

public class AlgorithmTest {
    public static void main(String[] args) {
        String plainText = "1110110101101111011101010111010001100001011100110110100101101101";
        String[] keys = {"11101101", "11000010", "00110100", "00011100", "11111110"};
        final String HEADER = com.cryptography_CSE310.Assignments.Assignement_1.Constants.ANSI_GREEN + """
                 ██████╗██████╗ ██╗   ██╗██████╗ ████████╗ ██████╗  ██████╗ ██████╗  █████╗ ██████╗ ██╗  ██╗██╗   ██╗
                ██╔════╝██╔══██╗╚██╗ ██╔╝██╔══██╗╚══██╔══╝██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗██╔══██╗██║  ██║╚██╗ ██╔╝
                ██║     ██████╔╝ ╚████╔╝ ██████╔╝   ██║   ██║   ██║██║  ███╗██████╔╝███████║██████╔╝███████║ ╚████╔╝\s
                ██║     ██╔══██╗  ╚██╔╝  ██╔═══╝    ██║   ██║   ██║██║   ██║██╔══██╗██╔══██║██╔═══╝ ██╔══██║  ╚██╔╝ \s
                ╚██████╗██║  ██║   ██║   ██║        ██║   ╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║     ██║  ██║   ██║  \s
                 ╚═════╝╚═╝  ╚═╝   ╚═╝   ╚═╝        ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝  ╚═╝   ╚═╝  \s
                """ + com.cryptography_CSE310.Assignments.Assignement_1.Constants.ANSI_RESET;

        CustomCipherAlgorithm encryption = new CustomCipherAlgorithm(keys);
        System.out.println(HEADER);
        String encryptedText = encryption.encrypt(plainText);
        System.out.println(Constants.ANSI_GREEN + "Encrypted Text: " + Constants.ANSI_RESET + encryptedText );

        String decryptedText = encryption.decrypt(encryptedText);
        System.out.println(Constants.ANSI_RED +"Decrypted Text: " + Constants.ANSI_RESET + decryptedText);
    }
}

