package com.structured_programming_SWE201.Chapter1and2.ClassExercises;

import java.util.Scanner;

public class Exercise02_07 {

    public static void main(String[] args) {

        Scanner khaled = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");

        double minutes = khaled.nextDouble();

        double numberOfDays = minutes / (24 * 60);
        double numberOfYears = numberOfDays / 365;
        double remainingDays = numberOfDays % 365;

        System.out.println(minutes + " minutes is approximately " +
                numberOfYears + " years and " + remainingDays + " days remaining");
    }
}
