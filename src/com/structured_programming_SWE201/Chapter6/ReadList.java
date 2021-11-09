package com.structured_programming_SWE201.Chapter6;

import java.util.Scanner;

public class ReadList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] midterm = new double[5];
        System.out.print("Please enter midterm marks for: " +
                midterm.length + ": ");
        for (int i = 0; i < midterm.length; i++) {
            midterm[i] = input.nextDouble();
        }
        for (int j = 0; j < midterm.length; j++){
            System.out.println(midterm[j]);
        }
    }
}
