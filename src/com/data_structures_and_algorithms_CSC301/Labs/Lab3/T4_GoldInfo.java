package com.data_structures_and_algorithms_CSC301.Labs.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class T4_GoldInfo {
    public static void main(String[] args) {
        int[][] goldPrices = {
                {18, 159, 158, 170},
                {21, 186, 176, 196},
                {22, 195, 181, 206},
                {24, 213, 202, 234}
        };

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Weight: ");
        int weight = in.nextInt();
        System.out.print("Enter CaratType: ");
        int caratType = in.nextInt();
        System.out.println("Enter Day: ");
        int day = in.nextInt();

        int cost = 0;
        boolean done = false;
        for (int i = 0; i < 4 && !done; i++)
            if (caratType == goldPrices[i][0]) {
                cost = goldPrices[i][day] * weight;
                done = true;
            }
        System.out.println("Cost: " + cost);

        //dispaly to total cost of the piece for that the last 3 days and for all carat types.
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(goldPrices[0]) + "K: ");
            for (int j = 1; j < 4; j++)
                System.out.print(goldPrices[i][j] * weight + "\t");
            System.out.println();
        }
    }
}
