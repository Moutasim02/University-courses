package com.cryptography_CSE310.Assignments.Assignment_2;

public class SBox {
    private final String[][] sBox = {
            {"010", "111", "100", "000", "110", "101", "011", "001"},
            {"111", "010", "000", "100", "101", "110", "001", "011"}
    };

    public String applySBox(String[] split) {
        StringBuilder result = new StringBuilder();
        for (String s : split) {
            int row = Integer.parseInt(s.substring(0, 1), 2);
            int col = Integer.parseInt(s.substring(1), 2);
            result.append(sBox[row][col]);
        }
        return result.toString();
    }
}