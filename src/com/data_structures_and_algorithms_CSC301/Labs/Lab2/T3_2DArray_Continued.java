package com.data_structures_and_algorithms_CSC301.Labs.Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T3_2DArray_Continued {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("population.txt");
        Scanner sc = new Scanner(file);
        int[][] arr = new int [18][2];

        while (sc.hasNext()) {
            for (int i = 0; i < 18; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = sc.nextInt();
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
