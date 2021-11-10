package com.structured_programming_SWE201.Project;

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
                    System.out.println("This is case 1");
                    ceaserCipher();
                    break;

                case 2:
                    System.out.println("This is case 2");
//                rowColumnTransposition();
                    break;

                default:
                    System.out.print("Error! Please select either 1 or 2 \n" +
                            "> ");
                    selectedType = khaled.nextInt();
                    continue;
            }
            break;
        }
    }

        public static void ceaserCipher() {
            Scanner textInput = new Scanner(System.in);
            System.out.print("Text: ");
            String textToEncrypt = textInput.nextLine();
            System.out.print("key: ");
            int keyToUse  = textInput.nextInt();
//            textToEncrypt = textToEncrypt.replaceAll("\\s+","");

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
                                textToEncrypt += temp;
                            }
                        }

                        else if (temp >= 'a' && temp <= 'z') {
                            temp = (char) (temp + keyToUse);
                            if(temp > 'z') { // go back to a in Ascii
                                temp = (char) (temp+'a'-'z'-1);
                                textToEncrypt += temp;
                            }
                            } else
                                textToEncrypt += temp;
                        break;
                        }
                    }
                    System.out.println("Enrypted text is: " + textToEncrypt);
                    break;

                }
            }
    }

