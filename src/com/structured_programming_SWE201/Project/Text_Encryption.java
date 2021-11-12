package com.structured_programming_SWE201.Project;

import java.util.Arrays;
import java.util.Scanner;

public class Text_Encryption {
    public static void main(String[] args) {
        Scanner khaled = new Scanner(System.in);
        String selectEncryptionType = "PLease select one of the following encryption types (1 or 2): \n"
                + "1- Ceaser Cipher\n"
                + "2- Rows-Columns Transposition";
        System.out.print(selectEncryptionType + "\n> ");
        int selectedType = khaled.nextInt();

        for (int i = 1; i>0;i++) {
            switch (selectedType) {
                case 1:
                    System.out.println("Encrypt or Decrypt:\n 1- Encryption\n 2- Decryption");
                    int type = khaled.nextInt();
                    
                    for (int j = 1; j > 0; j++){
                            if (type == 1) {
                            ceaserCipherEncryption();
                            break;
                        }
                            else if (type == 2) {
                            ceaserCipherDecryption();
                            break;
                        }
                            else if (type != 1 || type != 2){
                            System.out.print("Please enter a valid number (1 or 2): ");
                            type = khaled.nextInt();
                        }
                        continue;
                    }
                break;
                    

                case 2:
                    System.out.println("This is case 2");
                   
                    break;

                default:
                    do {System.out.print("Error! Please select either 1 or 2 \n" +
                            "> ");
                    selectedType = khaled.nextInt();
                }
                    while (selectedType == 1 || selectedType ==2);
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
            int keyToUse  = textInput.nextInt();
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
                            if(temp > 'Z') { // go back to A in Ascii
                                temp = (char) (temp+'A'-'Z'-1);
                                
                            }
                            cipher += temp;
                        }

                        else if (temp >= 'a' && temp <= 'z') {
                            temp = (char) (temp + keyToUse);
                            if(temp > 'z') { // go back to a in Ascii
                                temp = (char) (temp+'a'-'z'-1);
                                
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
            int keyToUse  = textInput.nextInt();
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
                            if(temp < 'A') { // go back to A in Ascii
                                temp = (char) (temp-'A'+'Z'+1);
                                
                            }
                            cipher += temp;
                        }

                        else if (temp >= 'a' && temp <= 'z') {
                            temp = (char) (temp - keyToUse);
                            if(temp < 'a') { // go back to a in Ascii
                                temp = (char) (temp-'a'+'z'+1);
                                
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









            // public static void rowColumnTransposition() {
    //             Scanner khaled = new Scanner(System.in);
    //             System.out.print("PlainText: ");
    //             String textToEncrypt = khaled.nextLine();
    //             textToEncrypt = textToEncrypt.replaceAll("\\s+","");
    //             char letters = textToEncrypt.charAt();
    //             int plaintextLength = textToEncrypt.length();
    //             System.out.print("keyword: ");
    //             String keyword  = khaled.nextLine();
    //             int columns = keyword.length();
    //             int rows = plaintextLength/columns;
    //             String cipher = "";
                
    //             char[][] encryptionArray = new char[rows][columns];
                
    //             System.out.println(encryptionArray);
    // }

                // public static String arrangeText(String password, String text){
                //     int[] arrange = arrangePassword(password);  
                    
                //     int lenPassword = arrange.length; // 4
                //     int lentext = text.length(); // 11
                    
                //     int row = (int) Math.ceil((double) lentext / lenPassword); //3
                    
                //     char[][] table = new char[row][lenPassword];
                //     int i = 0;
                    
                //     for (int x = 0; x < row; x++) { 
                //         for (int y = 0; y < lenPassword; y++) { 
                //             if (lentext == i) {  
                //                 table[x][y] = RandomAlpha();
                //             }
                //             else{
                //                 table[x][y] = text.charAt(i);
                //                 i++;  
                //             }
                //         }
                //     }

                //     String enc = "";
                //     for (int x = 0; x < lenPassword; x++) {
                //         for (int y = 0; y < lenPassword; y++) {
                //             if (x == arrange[y]) {
                //                 for (int a = 0; a < row; a++) { 
                //                     enc = enc + table[a][y];
                //                 }
                //             }
                //         }
                //     }
                //     return enc;
                // }

                // public static char RandomAlpha(){
                //     return (char)('a' + Math.random() * ('z' - 'a' + 1));
                // }
                // public static int [] arrangePassword(String password){
                //     String[] passwords = password.split(""); // H A C K
                //     Arrays.sort(passwords); // A C A H
                    
                //     int[] num = new int[password.length()]; 
                //     for (int x = 0; x < passwords.length; x++) {
                //         for (int y = 0; y < password.length(); y++) {
                //             if (passwords[x].equals(password.charAt(y) + "")) {
                //                 num[y] = x;
                //                 break;
                //             }
                //         }
                //     }
                //     return num;
                // }

}

