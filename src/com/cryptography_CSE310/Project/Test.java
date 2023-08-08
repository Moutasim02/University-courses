package com.cryptography_CSE310.Project;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        final int[][] seventhSBox = {
                {6, 14, 9, 2},
                {15, 5, 8, 13},
                {12, 7, 0, 4},
                {10, 1, 3, 11}
        };


//        [
//        [1, 15, 4, 0],
//        [7, 6, 5, 14],
//        [2, 3, 10, 13],
//        [11, 12, 8, 9]
//        ]


        System.out.println(Arrays.deepToString(generateInverseSBox(seventhSBox)));
    }
    public static int[][] generateInverseSBox(int[][] sBox) {
        int[][] inverseSBox = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sBoxValue = sBox[i][j];
                StringBuilder newLocation = new StringBuilder(String.format
                        ("%4s", Integer.toBinaryString(sBoxValue)).replace(' ', '0'));

                String i1 = String.format("%2s", Integer.toBinaryString(i)).replace(' ', '0');
                String j1 = String.format("%2s", Integer.toBinaryString(j)).replace(' ', '0');
                String ijLocation = i1.concat(j1);
                int newValue = Integer.parseInt(ijLocation, 2);

                int newI = Integer.parseInt(newLocation.substring(0,2), 2);
                int newJ = Integer.parseInt(newLocation.substring(2,4), 2);

                inverseSBox[newI][newJ] = newValue;
            }
        }
        return inverseSBox;
    }
}
