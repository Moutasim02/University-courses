package com.cryptography_CSE310.Assignments.Assignment_2;

public class DataExpansion {
    private final int[][] eMatrix = {
            {6, 1, 2, 3},
            {3, 4, 5, 6}
    };

    public String expand(String rightSide) {
        StringBuilder ePerm = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                ePerm.append(rightSide.charAt(eMatrix[i][j] - 1));
            }
        }
        return ePerm.toString();

    }

}
