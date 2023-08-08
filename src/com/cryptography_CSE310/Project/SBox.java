package com.cryptography_CSE310.Project;

public class SBox {

    public static String applySBox(String block, int sBoxNumber) {
        int[][] selectedSBox = switch (sBoxNumber) {
            case 1 -> firstSBox;
            case 2 -> secondSBox;
            case 3 -> thirdSBox;
            case 4 -> fourthSBox;
            case 5 -> fifthSBox;
            case 6 -> sixthSBox;
            case 7 -> seventhSBox;
            case 8 -> eighthSBox;
            case 9 -> ninthSBox;
            case 10 -> tenthSBox;
            default -> throw new IllegalStateException("Unexpected value: " + sBoxNumber);
        };

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < block.length(); i += 4) {
            String subBlock = block.substring(i, i + 4);
            int col = Integer.parseInt(subBlock.substring(0, 2), 2);
            int row = Integer.parseInt(subBlock.substring(2), 2);
            int value = selectedSBox[row][col];
            result.append(String.format("%4s", Integer.toBinaryString(value)).replace(' ', '0'));
        }
        return result.toString();
    }

    public static String applyInverseSBox(String block, int sBoxNumber) {
        int[][] selectedSBox = switch (sBoxNumber) {
            case 1 -> generateInverseSBox(firstSBox);
            case 2 -> generateInverseSBox(secondSBox);
            case 3 -> generateInverseSBox(thirdSBox);
            case 4 -> generateInverseSBox(fourthSBox);
            case 5 -> generateInverseSBox(fifthSBox);
            case 6 -> generateInverseSBox(sixthSBox);
            case 7 -> generateInverseSBox(seventhSBox);
            case 8 -> generateInverseSBox(eighthSBox);
            case 9 -> generateInverseSBox(ninthSBox);
            case 10 -> generateInverseSBox(tenthSBox);
            default -> throw new IllegalArgumentException("Invalid sBoxNumber: " + sBoxNumber);
        };

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < block.length(); i += 4) {
            String subBlock = block.substring(i, i + 4);
            int col = Integer.parseInt(subBlock.substring(0, 2), 2);
            int row = Integer.parseInt(subBlock.substring(2), 2);
            int value = selectedSBox[row][col];
            result.append(String.format("%4s", Integer.toBinaryString(value)).replace(' ', '0'));
        }
        return result.toString();
    }

    static int[][] firstSBox = {
            {14, 2, 4, 8},
            {7, 10, 1, 5},
            {9, 15, 12, 6},
            {3, 13, 11, 0}
    };

    static final int[][] secondSBox = {
            {12, 6, 15, 13},
            {3, 10, 4, 8},
            {2, 5, 9, 14},
            {0, 1, 7, 11}
    };

    static final int[][] thirdSBox = {
            {2, 5, 9, 1},
            {10, 3, 0, 15},
            {13, 7, 12, 6},
            {11, 14, 8, 4}
    };

    static final int[][] fourthSBox = {
            {3, 0, 8, 9},
            {2, 6, 5, 4},
            {14, 15, 10, 12},
            {13, 11, 7, 1}
    };

    static final int[][] fifthSBox = {
            {0, 1, 2, 3},
            {4, 5, 6, 7},
            {8, 9, 10, 11},
            {12, 13, 14, 15}
    };

    static final int[][] sixthSBox = {
            {1, 2, 4, 8},
            {3, 6, 12, 5},
            {7, 14, 9, 11},
            {15, 13, 10, 0}
    };

    static final int[][] seventhSBox = {
            {6, 14, 9, 2},
            {15, 5, 8, 13},
            {12, 7, 0, 4},
            {10, 1, 3, 11}
    };

    static final int[][] eighthSBox = {
            {0, 12, 10, 3},
            {5, 11, 15, 9},
            {2, 8, 7, 4},
            {6, 13, 14, 1}
    };

    static final int[][] ninthSBox = {
            {15, 14, 13, 12},
            {11, 10, 9, 8},
            {7, 6, 5, 4},
            {3, 2, 1, 0}
    };

    static final int[][] tenthSBox = {
            {5, 10, 15, 0},
            {9, 14, 3, 8},
            {13, 2, 7, 12},
            {1, 6, 11, 4}
    };

    public static int[][] generateInverseSBox(int[][] sBox) {
        int[][] inverseSBox = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sBoxValue = sBox[i][j];
                StringBuilder newLocation = new StringBuilder(String.format
                        ("%4s", Integer.toBinaryString(sBoxValue)).replace(' ', '0'));                String i1 = String.format("%2s", Integer.toBinaryString(i)).replace(' ', '0');
                String j1 = String.format("%2s", Integer.toBinaryString(j)).replace(' ', '0');
                String ijLocation = i1.concat(j1);
                int newValue = Integer.parseInt(ijLocation, 2);

                int newI = Integer.parseInt(newLocation.substring(0, 2), 2);
                int newJ = Integer.parseInt(newLocation.substring(2, 4), 2);

                inverseSBox[newI][newJ] = newValue;
            }
        }
        return inverseSBox;
    }

}
