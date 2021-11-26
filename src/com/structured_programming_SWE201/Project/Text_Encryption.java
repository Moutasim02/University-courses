package com.structured_programming_SWE201.Project;

import java.util.Arrays;
import java.util.Scanner;

public class Text_Encryption {
    static String OUTPUT = "";

    public static void main(String[] args) {
        Scanner khaled = new Scanner(System.in);
        String selectEncryptionType = "PLease select one of the following encryption types (1 or 2): \n"
                + "1- Ceaser Cipher\n"
                + "2- Rows-Columns Transposition";
        System.out.print(selectEncryptionType + "\n> ");
        int selectedType = khaled.nextInt();

        for (int i = 1; i > 0; i++) {
            switch (selectedType) {
                case 1:
                    System.out.println("Encrypt or Decrypt:\n 1- Encryption\n 2- Decryption");
                    int type = khaled.nextInt();

                    for (int j = 1; j > 0; j++) {
                        if (type == 1) {
                            ceaserCipherEncryption();
                            break;
                        } else if (type == 2) {
                            ceaserCipherDecryption();
                            break;
                        } else if (type != 1 || type != 2) {
                            System.out.print("Please enter a valid number (1 or 2): ");
                            type = khaled.nextInt();
                        }
                        continue;
                    }
                    break;

                case 2:
                    System.out.println("Encrypt or Decrypt:\n 1- Encryption\n 2- Decryption");
                    int ty = khaled.nextInt();

                    for (int j = 1; j > 0; j++) {
                        if (ty == 1) {
                            rowsColumnsTranspositionEncryption();
                            break;
                        } else if (ty == 2) {
                            rowsColumnsTranspositionDecryption();
                            break;
                        } else if (ty != 1 || ty != 2) {
                            System.out.print("Please enter a valid number (1 or 2): ");
                            type = khaled.nextInt();
                        }
                        continue;
                    }
                    break;

                default:
                    do {
                        System.out.print("Error! Please select either 1 or 2 \n" +
                                "> ");
                        selectedType = khaled.nextInt();
                    }
                    while (selectedType == 1 || selectedType == 2);
                    continue;
            }
            break;
        }
    }

    public static void ceaserCipherEncryption() {
        Scanner textInput = new Scanner(System.in);
        System.out.print("PlainText: ");
        String textToEncrypt = textInput.nextLine();
        System.out.print("shifting key: ");
        int keyToUse = textInput.nextInt();
        String cipher = "";
        for (int i = 0; true; i++) {
            if (keyToUse > 50 && keyToUse <= 0) {
                System.out.print("Please Enter key value <= 50: ");
                keyToUse = textInput.nextInt();
            } else {
                for (int j = 0; j < textToEncrypt.length(); j++) {
                    char temp = textToEncrypt.charAt(j);
                    if (temp >= 'A' && temp <= 'Z') {
                        temp = (char) (temp + keyToUse);
                        if (temp > 'Z') { // go back to A in Ascii
                            temp = (char) (temp + 'A' - 'Z' - 1);

                        }
                        cipher += temp;
                    } else if (temp >= 'a' && temp <= 'z') {
                        temp = (char) (temp + keyToUse);
                        if (temp > 'z') { // go back to a in Ascii
                            temp = (char) (temp + 'a' - 'z' - 1);

                        }
                        cipher += temp;
                    } else
                        cipher += temp;

                }
            }
            System.out.println("Enrypted text is: " + cipher);
            break;

        }
    }

    public static void ceaserCipherDecryption() {
        Scanner textInput = new Scanner(System.in);
        System.out.print("Encrypted Text: ");
        String textToEncrypt = textInput.nextLine();
        System.out.print("shifting key: ");
        int keyToUse = textInput.nextInt();
        String cipher = "";
        for (int i = 0; true; i++) {
            if (keyToUse > 50 && keyToUse <= 0) {
                System.out.print("Please Enter key value <= 50: ");
                keyToUse = textInput.nextInt();
            } else {
                for (int j = 0; j < textToEncrypt.length(); j++) {
                    char temp = textToEncrypt.charAt(j);
                    if (temp >= 'A' && temp <= 'Z') {
                        temp = (char) (temp - keyToUse);
                        if (temp < 'A') { // go back to A in Ascii
                            temp = (char) (temp - 'A' + 'Z' + 1);

                        }
                        cipher += temp;
                    } else if (temp >= 'a' && temp <= 'z') {
                        temp = (char) (temp - keyToUse);
                        if (temp < 'a') { // go back to a in Ascii
                            temp = (char) (temp - 'a' + 'z' + 1);
                        }
                        cipher += temp;
                    } else
                        cipher += temp;
                }
            }
            System.out.println("Decrypted text is: " + cipher);
            break;
        }
    }


    // Encryption Start RCT
    public static void rowsColumnsTranspositionEncryption() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text to encrypt: ");
        String textToEncrypt = input.nextLine().toUpperCase();
        OUTPUT = textToEncrypt;
        textToEncrypt = textToEncrypt.replaceAll("\\s", "");
        System.out.println("Enter a password: ");
        String passwordToUse = input.nextLine();

        int[] arrange = passwordReOrder(passwordToUse);
        //calculate the length for Password and text
        int passwordLength = arrange.length;
        int textLength = textToEncrypt.length();
        //calculate how many rows needs
        int row = (int) Math.ceil((double) textLength / passwordLength);
        //create array called table to arrange the text
        char[][] matrixTable = new char[row][passwordLength];
        int i = 0;

        for (int x = 0; x < row; x++) {
            for (int y = 0; y < passwordLength; y++) {
                if (textLength == i) {
                    //generate random Character for empty index
                    matrixTable[x][y] = RandomAlpha();
                } else {
                    //Arrange each Character inside the array
                    matrixTable[x][y] = textToEncrypt.charAt(i);
                    i++;
                }
            }
        }
        String encryptedText = "";
        //read table array and added to empty String
        for (int x = 0; x < passwordLength; x++) {
            for (int y = 0; y < passwordLength; y++) {
                if (x == arrange[y]) {
                    for (int a = 0; a < row; a++) {
                        encryptedText = encryptedText + matrixTable[a][y];
                    }
                }
            }
        }
        System.out.println("Encrypted Text : " + encryptedText.toUpperCase());
    }
    // Encryption Ends RCT

    // Decryption Starts RCT
    public static void rowsColumnsTranspositionDecryption() {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the text
        System.out.println("Enter the text: ");
        String text = input.nextLine();
        // Prompt the user to enter the password
        System.out.println("Enter the password: ");
        String password = input.nextLine();

        //call arrangePassword method
        int[] arrange = passwordReOrder(password);
        //calculate the length for Password and text
        int passwordLength = arrange.length;
        int textLength = text.length();
        //calculate how many rows needs
        int row = (int) Math.ceil((double) textLength / passwordLength);
        //create array called table to arrange the text
        char[][] table = new char[row][passwordLength];
        int i = 0; // 1 2

        for (int x = 0; x < passwordLength; x++) {
            for (int y = 0; y < passwordLength; y++) {
                if (x == arrange[y]) {
                    for (int a = 0; a < row; a++) {
                        table[a][y] = text.charAt(i);
                        i++;
                    }
                }
            }
        }
        String originalText = OUTPUT;
        String decryptedText = "";
        //read table array and added to empty String
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < passwordLength; y++) {
                decryptedText = decryptedText + table[x][y];
            }
        }
        System.out.println(decryptedText);

        String decr = "";
        for (int j = 0; j < originalText.length(); j++) {
            for (int k = 0; k < decryptedText.length(); k++) {
                if (decryptedText.charAt(k) == originalText.charAt(j)) {
                    if (decryptedText.equals(decr))
                        break;
                    else {
                        decr += decryptedText.charAt(k);
                        break;
                    }
                } else if ((char) (32) == originalText.charAt(j)) {
                    decr += (char) (32);
                    break;
                }
            }
        }
    }

    // Reorder the password in Alphabetic order for RCT
    public static int[] passwordReOrder(String password) {
        // split the password then arrange the password in Alphabetic order
        String[] splittedPasswords = password.split(""); // H A C K
        Arrays.sort(splittedPasswords); // A C H K

        // Array to
        int[] num = new int[password.length()];
        for (int x = 0; x < splittedPasswords.length; x++) {
            for (int y = 0; y < password.length(); y++) {
                if (splittedPasswords[x].equals(password.charAt(y) + "")) {
                    num[y] = x;
                    break;
                }
            }
        }
        return num;
    }

    public static char RandomAlpha() {
        return (char) ('a' + Math.random() * ('z' - 'a' + 1));
    }

}

