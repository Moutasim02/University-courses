package com.cryptography_CSE310.Assignments.Assignement_1;

public class ComboCipher {
    public static void main(String[] args) {
        final String HEADER = Constants.ANSI_GREEN + """
                 ██████╗██████╗ ██╗   ██╗██████╗ ████████╗ ██████╗  ██████╗ ██████╗  █████╗ ██████╗ ██╗  ██╗██╗   ██╗
                ██╔════╝██╔══██╗╚██╗ ██╔╝██╔══██╗╚══██╔══╝██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗██╔══██╗██║  ██║╚██╗ ██╔╝
                ██║     ██████╔╝ ╚████╔╝ ██████╔╝   ██║   ██║   ██║██║  ███╗██████╔╝███████║██████╔╝███████║ ╚████╔╝\s
                ██║     ██╔══██╗  ╚██╔╝  ██╔═══╝    ██║   ██║   ██║██║   ██║██╔══██╗██╔══██║██╔═══╝ ██╔══██║  ╚██╔╝ \s
                ╚██████╗██║  ██║   ██║   ██║        ██║   ╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║     ██║  ██║   ██║  \s
                 ╚═════╝╚═╝  ╚═╝   ╚═╝   ╚═╝        ╚═╝    ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝  ╚═╝   ╚═╝  \s
                """ + Constants.ANSI_RESET;
        System.out.print(HEADER);
        String plainText = "Cyber security is the application of " +
                "technologies, processes, and controls to protect " +
                "systems, networks, programs, devices, and data from " +
                "cyber-attacks";
        System.out.println(Constants.ANSI_RED + "\nOriginal String: \n"+ Constants.ANSI_RESET + plainText);
        int secretKey = (1080415) % 36;
        String cipherText = CaeserCipher.encrypt(plainText, secretKey);
        System.out.println(Constants.ANSI_GREEN + "\"CaeserCipher\" encrypted text: \n" + Constants.ANSI_RESET + cipherText);

        String keyString = "Moutasim";
        String cipherText2 = PlayfairCipher.encrypt(cipherText, keyString);
        System.out.println(Constants.ANSI_BLUE + "2nd Encryption \"PlayfairCipher\" encrypted text: \n" + Constants.ANSI_RESET + cipherText2);

        String decryptedText2 = PlayfairCipher.decrypt(cipherText2, keyString);
        System.out.println(Constants.ANSI_RED + "\"PlayfairCipher\" decrypted text: \n"+ Constants.ANSI_RESET + decryptedText2);

        String decryptedText = CaeserCipher.decrypt(cipherText, secretKey);
        System.out.println(Constants.ANSI_GREEN + "2nd Decryption \"CaeserCipher\" decrypted text: \n"+ Constants.ANSI_RESET + decryptedText);

    }
}