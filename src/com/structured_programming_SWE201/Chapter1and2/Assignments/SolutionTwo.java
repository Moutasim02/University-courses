/*
(Science: calculating energy) Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is
Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius,
and energy Q is measured in joules.
*/

package com.structured_programming_SWE201.Chapter1and2.Assignments;

import java.util.Scanner;

public class SolutionTwo {
    public static void main(String[] args) {
        // Get the scanner object from the util library
        Scanner scanner = new Scanner(System.in);

        // Assign the values entered to a variable
        System.out.print("Enter the amount of water in kilograms: ");
        float waterInKilo = scanner.nextFloat();

        System.out.print("Enter the initial temperature: ");
        float initialTemperature = scanner.nextFloat();

        System.out.print("Enter the final temperature: ");
        float finalTemperature = scanner.nextFloat();
        // Calculate using the formula
        float energy =  waterInKilo * ( finalTemperature - initialTemperature ) * 4184;
        System.out.print("The energy needed is " + energy + " joules");

    }
}

