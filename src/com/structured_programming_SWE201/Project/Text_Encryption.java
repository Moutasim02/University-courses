    package com.structured_programming_SWE201.Project;

    import java.util.Arrays;
    import java.util.Scanner;

    public class Text_Encryption {
    String alphabetsAndCharactersRange = "abcdefghijklmnopqrstuvwxyzABCDEFG"
            + "HIJKLMNOPQRSTUVWXYZ0123456789,.;:-@";
    static Object[][] Two_D_Table;
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
                System.out.println("Encrypt or Decrypt:\n 1- Encryption\n 2- Decryption");
                int ty = khaled.nextInt();
                
                for (int j = 1; j > 0; j++){
                        if (ty == 1) {
                            System.out.print("Please enter the key: ");
                            String key = khaled.nextLine();
                            System.out.print("Please enter the key: ");
                            String plainText = khaled.nextLine();
                            // rowsColumnsTranspositionEncryption();
                        break;
                    }
                        else if (ty == 2) {
                            System.out.print("Please enter the key: ");
                            String key = khaled.nextLine();
                            System.out.print("Please enter the key: ");
                            String cipherText = khaled.nextLine();
                            // rowsColumnsTranspositionDecryption();
                        break;
                    }
                        else if (ty != 1 || ty != 2){
                        System.out.print("Please enter a valid number (1 or 2): ");
                        type = khaled.nextInt();
                    }
                    continue;
                }
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

    }

