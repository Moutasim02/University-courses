package com.structured_programming_SWE201.Chapter6.Testing;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptionTest {

//Prompt


    public static class TextEncryption {
        public static void main(String[] args) {

            run();

        }
        public static void run(){
            Scanner input = new Scanner(System.in);
            char answer = 'Y';
            // Prompt the user to choice the method
            do {
                System.out.print("1- Rows-Columns Transposition\n2- Caesar Cipher"
                        + "\n3- Exit\nWhich method you would use: ");
                int choice = input.nextInt();

                switch (choice){
                    case 1:// choice 1 is Rows-Columns Transposition
                        System.out.print("1.Encrypt 2.Decrypt: ");
                        choice = input.nextInt();
                        if(choice == 1)
                            encryptionRowsColumns();
                        else
                            decryptionRowsColumns();
                        break;
                    case 2://choice 2 is Caesar Cipher
                        System.out.print("1.Encrypt 2.Decrypt: ");
                        choice = input.nextInt();
                        if(choice == 1)
                            encryptionCaesarCipher();
                        else
                            decryptionCaesarCipher();
                        break;
                    case 3: System.exit(0); break;

                    default:
                }
                input.nextLine();
                System.out.print("Run the program again (Y/N) : ");
                answer = input.nextLine().charAt(0);

            }while ( answer == 'Y'|| answer == 'y' );
        }
        // Decryption method for Caesar Cipher
        public static void decryptionCaesarCipher(){
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the text
            System.out.print("Enter the text : ");
            String text = input.nextLine().toUpperCase();
            //Prompt the user to enter the the value that will shift each character
            System.out.print("Enter the value that will shift each "
                    + "character in the plaintext message: ");
            int shift = input.nextInt();
            ////call the method to Decrypt the text
            String decrypt = decryptedTextCaesarCipher(shift, text);
            System.out.println("Decrypted Text : " + decrypt);
        }
        // Encryption method for Caesar Cipher
        public static void encryptionCaesarCipher(){
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the text
            System.out.print("Enter the text : ");
            String text = input.nextLine().toUpperCase();
            ORTEXT = text;
            //Prompt the user to enter the the value that will shift each character
            System.out.print("Enter the value that will shift each "
                    + "character in the plaintext message: ");
            int shift = input.nextInt();
            //call the method to Encrypt the text
            String encrypt = encryptedTextCaesarCipher(shift, text);
            System.out.println("Encrypted Text : " + encrypt);

        }
        static String ORTEXT = "";
        // Encryption method for Rows-Columns Transposition
        public static void encryptionRowsColumns(){
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the text
            System.out.println("Enter the text: "); //
            String text = input.nextLine().toUpperCase(); // ahmadnasser
            ORTEXT = text;
            text = text.replaceAll("\\s", "");

            // Prompt the user to enter the password
            System.out.println("Enter the password: ");
            String password = input.nextLine();
            //call the method Encrypt the text
            String encrypt = encryptedTextRowsColumns(password, text).toUpperCase();
            System.out.println("Encrypted Text : " + encrypt);

        }
        //Decryption method for Rows-Columns Transposition
        public static void decryptionRowsColumns(){
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter the text
            System.out.println("Enter the text: ");
            String text = input.nextLine();
            // Prompt the user to enter the password
            System.out.println("Enter the password: ");
            String password = input.nextLine();
            //call the method to Decrypt the text
            String decrypt = decryptedTextRowsColumns(password, text).toUpperCase();
            System.out.println("Dcrypted Text : " + decrypt);
        }
        //Encrypt the text and read it for Rows-Columns Transposition method
        public static String encryptedTextRowsColumns(String password, String text){
            //call arrangePassword method
            int[] arrange = arrangePassword(password);
            //calculate the length for Password and text
            int lenPassword = arrange.length;
            int lentext = text.length();
            //calculate how many rows needs
            int row = (int) Math.ceil((double) lentext / lenPassword);
            //create array called table to arrange the text
            char[][] table = new char[row][lenPassword];
            int i = 0;

            for (int x = 0; x < row; x++) {
                for (int y = 0; y < lenPassword; y++) {
                    if (lentext == i) {
                        //generate random Character for empty index
                        table[x][y] = RandomAlpha();
                    }
                    else{
                        //Arrange each Character inside the array
                        table[x][y] = text.charAt(i);
                        i++;
                    }
                }
            }
            //Declaring empth Variables
            String enc = "";
            //read table array and added to empty String
            for (int x = 0; x < lenPassword; x++) {
                for (int y = 0; y < lenPassword; y++) {
                    if (x == arrange[y]) {
                        for (int a = 0; a < row; a++) {
                            enc = enc + table[a][y];
                        }
                    }
                }
            }
            return enc;
        }
        //Decrypt the text and read it for Rows-Columns Transposition method
        public static String decryptedTextRowsColumns(String password, String text) {
            //call arrangePassword method
            int[] arrange = arrangePassword(password);
            //calculate the length for Password and text
            int lenPassword = arrange.length;
            int lentext = text.length();
            //calculate how many rows needs
            int row = (int) Math.ceil((double) lentext / lenPassword);
            //create array called table to arrange the text
            char[][] table = new char[row][lenPassword];
            int i = 0; // 1 2

            for (int x = 0; x < lenPassword; x++) {
                for (int y = 0; y < lenPassword; y++) {
                    if (x == arrange[y]){
                        for (int a = 0; a < row; a++) {
                            table[a][y] = text.charAt(i);
                            i++;
                        }
                    }
                }
            }
            String originalText = ORTEXT; //hi ahmad nasser
            //Declaring empth Variables
            String dec = ""; //hiahmadnassergd
            //read table array and added to empty String
            for (int x = 0; x < row; x++) {
                for (int y = 0; y < lenPassword; y++) {
                    dec = dec + table[x][y];
                }
            }
            String decr = "";
            for(int j = 0; j < originalText.length();j++){
                for(int k = 0; k < dec.length(); k++){
                    if(dec.charAt(k) == originalText.charAt(j)){
                        if(dec.equals(decr))
                            break;
                        else{
                            decr += dec.charAt(k);
                            break;
                        }
                    }
                    else if((char)(32) == originalText.charAt(j)){
                        decr += (char)(32);
                        break;
                    }
                }
            }
            return decr;
        }
        //generate random Character for Rows-Columns Transposition method
        public static char RandomAlpha(){
            return (char)('a' + Math.random() * ('z' - 'a' + 1));
        }
        //Arrange the password in Alphabetic order for Rows-Columns Transposition method
        public static int [] arrangePassword(String password){
            //split the password the arrange the password in Alphabetic order
            String[] passwords = password.split(""); // H A C K
            Arrays.sort(passwords); // A C H K

            int[] num = new int[password.length()];
            for (int x = 0; x < passwords.length; x++) {
                for (int y = 0; y < password.length(); y++) {
                    if (passwords[x].equals(password.charAt(y) + "")) {
                        num[y] = x;
                        break;
                    }
                }
            }
            return num;
        }
        //Encrypt the text using Caesar Cipher
        public static String encryptedTextCaesarCipher(int shift, String text){
            //Declaring empth Variables
            String encryptedtext = "";
            char letter;

            for(int i = 0; i < text.length(); i++){
                // read each character
                letter = text.charAt(i);

                // if alphabet lies between A and Z
                if(letter >= 'A' && letter <= 'Z'){
                    // shift alphabet
                    letter = (char) (letter + shift);
                    // if alphabet greater than Z
                    if(letter > 'Z')
                        // shift alphabet
                        letter = (char) (letter + 'A' - 'Z' -1);
                    //Add the latter to  encryptedtext variable
                    encryptedtext += letter;
                }
            }
            return encryptedtext;
        }
        //Decrypt the text using Caesar Cipher
        public static String decryptedTextCaesarCipher(int shift, String text){
            String originalText = ORTEXT;
            //Declaring empth Variables
            String decryptText = "";
            char letter;

            for(int i=0; i < text.length();i++){
                // read each character
                letter = text.charAt(i);
                // if alphabet lies between A and Z
                if(letter >= 'A' && letter <= 'Z'){
                    // shift alphabet
                    letter = (char) (letter - shift);
                    // if alphabet less than Z
                    if(letter < 'A')
                        // shift alphabet
                        letter = (char) (letter - 'A' + 'Z' + 1);
                    //Add the latter to  decryptText variable
                    decryptText += letter;
                }

            }

            String decrypt = "";
            for(int j = 0; j < originalText.length();j++){
                for(int k = 0; k < decryptText.length(); k++){
                    if(decryptText.charAt(k) == originalText.charAt(j)){
                        if(decryptText.equals(decrypt))
                            break;
                        else{
                            decrypt += decryptText.charAt(k);
                            break;
                        }
                    }
                    else if((char)(32) == originalText.charAt(j)){
                        decrypt += (char)(32);
                        break;
                    }
                }
            }
            return decrypt;
        }
    }
}
