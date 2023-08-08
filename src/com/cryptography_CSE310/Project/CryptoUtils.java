package com.cryptography_CSE310.Project;

public class CryptoUtils {
    public static String xor(String permutationOutput, String key) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (key.charAt(i) == permutationOutput.charAt(i)) {
                str.append("0");
            } else {
                str.append("1");
            }
        }
        return str.toString();
    }
}

