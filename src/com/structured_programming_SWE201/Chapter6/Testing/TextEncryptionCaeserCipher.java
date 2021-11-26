package com.structured_programming_SWE201.Chapter6.Testing;

import java.util.Scanner;

public class TextEncryptionCaeserCipher {

    static String cipheredText = "";
    public static void main(String[] args) {
        Scanner yazan = new Scanner(System.in);
        System.out.println("Ceaser Cipher! PLease select one of the following methods (1 or 2): \n"
                + "1- Encrypt\n"
                + "2- Decrypt");
        int input = yazan.nextInt();


        for (int j = 1; j > 0; j++) {
            if (input == 1) {
                CaeserCipherEncrypt();
                break;
            } else if (input == 2) {
                CaeserCipherDecrypt();
                break;
            } else if (input != 1 || input != 2) {
                System.out.print("Please enter a valid number (1 or 2): ");
                input = yazan.nextInt();
            }
        }
    }


    public static void CaeserCipherEncrypt() {
        Scanner textInput = new Scanner(System.in);
        System.out.print("PlainText: ");
        String textToEncrypt = textInput.nextLine();
        System.out.print("shifting key: ");
        int shift = textInput.nextInt();
        int length = textToEncrypt.length();
        for (int x = 0; x < length; x++) {
            char c = (char) (textToEncrypt.charAt(x) + shift);
            if (c > 'z')
                cipheredText += (char) (textToEncrypt.charAt(x) - (26 - shift));
            else
                cipheredText += (char) (textToEncrypt.charAt(x) + shift);
        }
        System.out.println("Enrypted text is: " + cipheredText);

    }

    public static void CaeserCipherDecrypt() {
        Scanner textInput = new Scanner(System.in);
        System.out.print("PlainText: ");
        String textToEncrypt = textInput.nextLine();
        System.out.print("shifting key: ");
        int shift = textInput.nextInt();
        int length = textToEncrypt.length();
        for (int x = 0; x < length; x++) {
            char c = (char) (textToEncrypt.charAt(x) + shift);
            if (c > 'z')
                cipheredText += (char) (textToEncrypt.charAt(x) - (26 - shift));
            else
                cipheredText += (char) (textToEncrypt.charAt(x) + shift);
        }
        System.out.println("Decrypted text is: "+ cipheredText);
    }
}


