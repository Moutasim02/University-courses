package com.structured_programming_SWE201.Chapter4.ClassExercises;

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter Six numbers : ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        double n5 = input.nextDouble();
        double n6 = input.nextDouble();

// write statement to find maximum value in one line
        double mx = Math.max(Math.max(Math.max(n1, n2), Math.max(n3, n4)), Math.max(n5, n6));
//write statement to find minimum value in one line

        double mn = Math.min(Math.min(Math.min(n1, n2), Math.min(n3, n4)), Math.min(n5, n6));
        System.out.println("Maximum value is " + mx);
        System.out.println("Minimum value is " + mn);
    }

}