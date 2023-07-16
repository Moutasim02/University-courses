package com.cryptography_CSE310.Assignments.Assignement_1;

import java.util.ArrayList;

public class PlayfairCipher {
    static ArrayList<Character> CHARACTERS_TO_USE = new ArrayList<>();
    static char[][] matrix = new char[6][6];

    public static String encrypt(String plainText, String key) {
        addCharacters();
        String updatedKey = deleteDuplicateCharactersFromKey(key.toUpperCase());
        updatedKey = addAlphabetsToKey(updatedKey);
        updatedKey = deleteDuplicateCharactersFromKey(updatedKey);
        addToMatrix(matrix, updatedKey);
        return encryptHelper(matrix, plainText);
    }

    public static String decrypt(String cipherText, String key) {
        addCharacters();
        String updatedKey = deleteDuplicateCharactersFromKey(key.toUpperCase());
        updatedKey = addAlphabetsToKey(updatedKey);
        updatedKey = deleteDuplicateCharactersFromKey(updatedKey);
        addToMatrix(matrix, updatedKey);
        return decryptHelper(matrix, cipherText);
    }

    private static String encryptHelper(char[][] matrix, String plainText) {
        if (plainText.length() % 2 != 0)
            plainText += 'X';

        plainText = plainText.toUpperCase();
        plainText = plainText.replaceAll("[\\r\\n\\t\\f\\v/,-/ ]", "");
        char[] text = plainText.toCharArray();

        String textOutput = "";
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0;

        int letter = 1;
        for (int i = 0; i < text.length; i++) {
            boolean check = true;
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    if (text[i] == matrix[j][k] || (text[i] == 'J' && check)) {
                        if (letter == 1) {
                            if (text[i] == 'J') {
                                i1 = 2;
                                i2 = 0;
                                check = false;
                            } else {
                                i1 = j;
                                i2 = k;

                            }
                            letter++;
                        } else if (letter == 2) {
                            if (text[i] == 'J') {
                                i3 = 2;
                                i4 = 0;
                                check = false;
                            } else {
                                i3 = j;
                                i4 = k;
                            }
                            if (i1 == i3 && i2 == i4) {
                                i3 = 3;
                                i4 = 4;
                                k = 1;
                            }
                            if (i1 == i3) {
                                if (i2 == 5 && i4 < 5) {
                                    textOutput += matrix[i1][i2 - 5];
                                    textOutput += matrix[i3][i4 + 1];
                                } else if (i4 == 5 && i2 < 5) {
                                    textOutput += matrix[i1][i2 + 1];
                                    textOutput += matrix[i3][i4 - 5];
                                } else if (i4 < 5 && i2 < 5) {
                                    textOutput += matrix[i1][i2 + 1];
                                    textOutput += matrix[i3][i4 + 1];
                                }
                            } else if (i2 == i4) {
                                if (i1 == 5 && i3 < 5) {
                                    textOutput += matrix[i1 - 5][i2];
                                    textOutput += matrix[i3 + 1][i4];
                                } else if (i3 == 5 && i1 < 5) {
                                    textOutput += matrix[i1 + 1][i2];
                                    textOutput += matrix[i3 - 5][i4];
                                } else if (i1 < 5 && i3 < 5) {
                                    textOutput += matrix[i1 + 1][i2];
                                    textOutput += matrix[i3 + 1][i4];
                                }
                            } else {
                                textOutput += matrix[i1][i4];
                                textOutput += matrix[i3][i2];
                            }
                            letter = 1;
                        }
                    }
                }
            }
        }
        return textOutput;
    }

    private static String decryptHelper(char[][] matrix, String cipherText) {
        if (cipherText.length() % 2 != 0)
            cipherText += 'X';

        cipherText = cipherText.toUpperCase();
        char[] text = cipherText.toCharArray();

        String textOutput = "";
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0;

        int letter = 1;
        for (int i = 0; i < text.length; i++) {
            boolean check = true;
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    if (text[i] == matrix[j][k] || (text[i] == 'J' && check)) {
                        if (letter == 1) {
                            if (text[i] == 'J') {
                                i1 = 2;
                                i2 = 0;
                                check = false;
                            } else {
                                i1 = j;
                                i2 = k;

                            }
                            letter++;
                        } else if (letter == 2) {
                            if (text[i] == 'J') {
                                i3 = 2;
                                i4 = 0;
                                check = false;
                            } else {
                                i3 = j;
                                i4 = k;
                            }
                            if (i1 == i3 && i2 == i4) {
                                i3 = 3;
                                i4 = 4;
                                k = 1;
                            }
                            if (i1 == i3) {
                                if (i2 == 0 && i4 > 0) {
                                    textOutput += matrix[i1][i2 + 5];
                                    textOutput += matrix[i3][i4 - 1];
                                } else if (i4 == 0 && i2 > 0) {
                                    textOutput += matrix[i1][i2 - 1];
                                    textOutput += matrix[i3][i4 + 5];
                                } else if (i4 > 0 && i2 > 0) {
                                    textOutput += matrix[i1][i2 - 1];
                                    textOutput += matrix[i3][i4 - 1];
                                }
                            } else if (i2 == i4) {
                                if (i1 == 0 && i3 > 0) {
                                    textOutput += matrix[i1 + 5][i2];
                                    textOutput += matrix[i3 - 1][i4];
                                } else if (i3 == 0 && i1 > 0) {
                                    textOutput += matrix[i1 - 1][i2];
                                    textOutput += matrix[i3 + 5][i4];
                                } else if (i1 > 0 && i3 > 0) {
                                    textOutput += matrix[i1 - 1][i2];
                                    textOutput += matrix[i3 - 1][i4];
                                }
                            } else {
                                textOutput += matrix[i1][i4];
                                textOutput += matrix[i3][i2];
                            }
                            letter = 1;
                        }
                    }
                }
            }
        }
        return textOutput;
    }

    private static char[][] addToMatrix(char[][] matrix, String updatedKey) {
        int count = 0;
        int row = 6;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < updatedKey.length(); j++) {
                if (count < row) {
                    matrix[i][j] = updatedKey.charAt(count);
                    count++;
                } else if (count == row) {
                    row += 6;
                    break;
                }
            }
        }
        return matrix;
    }

    private static String deleteDuplicateCharactersFromKey(String key) {
        String secretKey = "";
        int j;

        for (int i = 0; i < key.length(); i++) {
            for (j = 0; j < i; j++)
                if (key.charAt(i) == key.charAt(j))
                    break;
            if (i == j)
                secretKey += key.charAt(i);
        }
        return secretKey;
    }

    private static String addAlphabetsToKey(String updatedKey) {
        for (Character character : CHARACTERS_TO_USE) {
            if (character != 'J')
                updatedKey += character;
        }
        return updatedKey;
    }

    public static void addCharacters() {
        CHARACTERS_TO_USE.clear();
        for (char j = 'A'; j <= 'Z'; j++)
            CHARACTERS_TO_USE.add(j);
        for (char j = '0'; j <= '9'; j++)
            CHARACTERS_TO_USE.add(j);
        CHARACTERS_TO_USE.add('@');
        CHARACTERS_TO_USE.add('#');
    }
}