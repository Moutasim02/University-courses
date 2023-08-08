package com.cryptography_CSE310.Project;

public class BitPermutation {
    int[][] firstPTable = {
            {1, 2, 3, 4, 5, 6, 7, 8},
            {5, 2, 7, 6, 3, 4, 1, 8}
    };
    int[][] secondPTable = {
            {1, 2, 3, 4, 5, 6, 7, 8},
            {7, 4, 5, 6, 3, 8, 1, 2}
    };
    int[][] thirdPTable = {
            {1, 2, 3, 4, 5, 6, 7, 8},
            {2, 8, 7, 1, 6, 3, 5, 4}
    };
    int[][] fourthPTable = {
            {1, 2, 3, 4, 5, 6, 7, 8},
            {3, 5, 1, 7, 6, 2, 8, 4}
    };
    int[][] fifthPTable = {
            {1, 2, 3, 4, 5, 6, 7, 8},
            {6, 1, 8, 2, 3, 4, 5, 7}
    };


    public String applyPermutation(String sBoxOutput, int roundNumber) {
        int[][] permutationTable = switch (roundNumber) {
            case 1 -> firstPTable;
            case 2 -> secondPTable;
            case 3 -> thirdPTable;
            case 4 -> fourthPTable;
            case 5 -> fifthPTable;
            default -> throw new IllegalStateException("Unexpected value: " + roundNumber);
        };
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int index = permutationTable[1][i] - 1;
            result.append(sBoxOutput.charAt(index));
        }

        return result.toString();
    }

    public String inversePermutation(String xorResult, int roundNumber) {
        int[][] permutationTable = switch (roundNumber) {
            case 1 -> firstPTable;
            case 2 -> secondPTable;
            case 3 -> thirdPTable;
            case 4 -> fourthPTable;
            case 5 -> fifthPTable;
            default -> throw new IllegalStateException("Unexpected value: " + roundNumber);
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int index = permutationTable[0][i] - 1;
            result.append(xorResult.charAt(index));
        }

        return result.toString();
    }
}
