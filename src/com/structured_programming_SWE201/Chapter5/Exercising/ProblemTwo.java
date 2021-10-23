package com.structured_programming_SWE201.Chapter5.Exercising;

import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = scanner.nextInt();

        int sum = 0;
        if (firstNumber % 2 == 0 && secondNumber % 2 == 0) {
            sum = firstNumber + secondNumber;
            System.out.println(sum);
        } else if (firstNumber % 2 == 0) {
            sum = firstNumber;
        } else if (secondNumber % 2 == 0) {
            sum = secondNumber;
        } else {
            System.out.println("All given integers are even");
        }
        System.out.println("sum = " + sum);
    }
}
