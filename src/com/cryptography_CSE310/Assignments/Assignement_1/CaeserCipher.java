package com.cryptography_CSE310.Assignments.Assignement_1;

import java.util.Arrays;
import java.util.List;

public class CaeserCipher {
    private static final List<Character> CHARACTERS_TO_USE = Arrays.asList(
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    );

    public static String encrypt(String plainText, int key) {
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            for (int j = 0; j < CHARACTERS_TO_USE.size(); j++) {
                if (CHARACTERS_TO_USE.get(j).equals(plainText.toUpperCase().charAt(i))) {
                    int index = Math.floorMod((j + key), 36);
                    cipherText.append(CHARACTERS_TO_USE.get(index));
                }
            }
        }
        return cipherText.toString();
    }

    public static String decrypt(String cipherText, int key) {
        return encrypt(cipherText, -key);
    }
}