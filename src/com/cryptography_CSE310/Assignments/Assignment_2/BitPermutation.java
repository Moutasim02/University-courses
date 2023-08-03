package com.cryptography_CSE310.Assignments.Assignment_2;

public class BitPermutation {
    private final int[][] initialMatrix = {
            {7, 1, 8, 12},
            {3, 5, 9, 10},
            {2, 4, 6, 11}
    };

    private final int[][] secondMatrix = {
            {4, 5, 3},
            {1, 6, 2}
    };

    private final int[][] finalMatrix = {
            {6, 9, 3, 7},
            {10, 1, 5, 12},
            {4, 11, 8, 2}
    };


    public String initialPermutation(String text) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                str.append(text.charAt(initialMatrix[i][j] - 1));
            }
        }
        return str.toString();
    }

    public String secondPermutation(String groupedString) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                str.append(groupedString.charAt(secondMatrix[i][j] - 1));
            }
        }
        return str.toString();
    }

    public String finalPermutation(String reversed) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                str.append(reversed.charAt(finalMatrix[i][j] - 1));
            }
        }
        return str.toString();
    }

}
