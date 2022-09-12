package com.data_structures_and_algorithms_CSC301.Labs.Lab2;

public class T2_2DArray {
    public static void main(String[] args){
        try {
            int[][] plateNumbers = new int[2][2];
            plateNumbers [0][0] = 87232;
            plateNumbers [0][1] = 90872;
            plateNumbers [1][0] = 28345;
            plateNumbers [1][1] = 22314;

            for (int i = 0; i < plateNumbers.length; i++) {
                for (int j = 0; j < plateNumbers.length; j++) {
                    System.out.print(plateNumbers[i][j] + "\t");
                }
                System.out.println();
            }
        } catch(ArrayIndexOutOfBoundsException exception) {
            System.out.print("inside the catch");
        }
    }

}
