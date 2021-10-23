package com.structured_programming_SWE201.Chapter5.Exercising;

import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter two integer numbers. \nnumber 1: ");
        int firstNumber = input.nextInt();
        System.out.print("number 2: ");
        int secondNumber = input.nextInt();


        if (firstNumber % 2 == 0 && secondNumber % 2 == 0) {
            System.out.println(firstNumber + " " + secondNumber);
            System.out.println(Math.sqrt(firstNumber) + " " + Math.sqrt(secondNumber));
        } else if (firstNumber % 2 == 0) {
            System.out.println(firstNumber);
            System.out.println(Math.sqrt(firstNumber));
        } else if (secondNumber % 2 == 0) {
            System.out.println(secondNumber);
            System.out.println(Math.sqrt(secondNumber));
        } else
            System.out.println("All number are odd");

    }

}