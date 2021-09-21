/*
(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
*/


package com.structured_programming_SWE201.Chapter1and2.Assignments;

import java.util.Scanner;

public class SolutionOne {
    public static void main(String[] args) {
        // Get the scanner object from the util library
        Scanner scanner = new Scanner(System.in);

        // Assign the value entered to a variable
        System.out.print("Enter a number between 0 and 1000: ");
        int userInput = scanner.nextInt();

        if (userInput >= 0 && userInput <= 1000) {
            // beginning of total calculation, Extract the digit less than 10
            int lessThanTen = userInput % 10;

            // get the extracted digit out of the stack
            userInput /= 10;

            // Extract the digit between 10 and 99
            int tens = userInput % 10;

            // get the extracted digit out of the stack
            userInput /= 10;

            // Extract the digit between 100 and 999
            int hundreds = userInput % 10;

            // get the extracted digit out of the stack
            userInput /= 10;

            int total = hundreds + tens + lessThanTen;

            // Display results
            System.out.println("The sum of the digits is " + total);

        } else {
            System.out.println("Undefined");
        }
    }
}

//usually I don't put that many comments, but for the purpose of this assignment to make everything clear