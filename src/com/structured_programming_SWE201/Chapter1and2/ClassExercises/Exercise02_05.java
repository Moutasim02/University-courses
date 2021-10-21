
package com.structured_programming_SWE201.Chapter1and2.ClassExercises;

import java.util.Scanner;


public class Exercise02_05 {

    public static void main(String[] args) {

        Scanner khaled = new Scanner(System.in);

        System.out.println("Enter the subtotal and a gratuity rate");

        double subtotal = khaled.nextDouble();
        double rate = khaled.nextDouble();
        double gratuity = subtotal * rate / 100;

        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + "total is $" +
                total);

    }

}
