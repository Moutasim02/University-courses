package com.cryptography_CSE310.Assignments.Assignment_2;

public class DESUtils {
    public static String xor(String expanded, String key, int stoppingPoint) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < stoppingPoint; i++) {
            if (key.charAt(i) == expanded.charAt(i)) {
                str.append("0");
            } else {
                str.append("1");
            }
        }
        return str.toString();
    }

    public static String[] split(String text) {
        String[] strArr = new String[2];
        strArr[0] = text.substring(1, 4);
        strArr[1] = text.substring(5, 8);
        return strArr;
    }

    public static String reverse(String rightSide, String secondXOR) {
        return rightSide + secondXOR;
    }
}
