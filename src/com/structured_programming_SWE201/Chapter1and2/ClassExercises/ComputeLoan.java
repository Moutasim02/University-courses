
package com.structured_programming_SWE201.Chapter1and2.ClassExercises;

import java.util.Scanner;


public class ComputeLoan {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner khaled = new Scanner(System.in);

        // Enter yearly interest rate
        System.out.print("Enter yearly interest rate, for example 8.25: ");
        double annualInterestRate = khaled.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Enter number of years
        System.out.print(
                "Enter number of years as an integer, for example 5: ");
        int numberOfYears = khaled.nextInt();

        // Enter loan amount
        System.out.print("Enter loan amount, for example AED 120000.95: ");
        double loanAmount = khaled.nextDouble();

        // Calculate payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        double totalInterest = totalPayment - loanAmount;

        // Display results
        System.out.println("The monthly payment is AED " +
                (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is AED " +
                (int) (totalPayment * 100) / 100.0);
        //display total interest

        System.out.println("Total interest ts AED " + (int) (totalInterest * 100) / 100.0);
    }

}