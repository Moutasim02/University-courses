package com.structured_programming_SWE201.Chapter4.classAssignment;

import java.util.Scanner;

public class BMI_Calculator {

    public static void main(String[] args) {

        // create scanner channel
        Scanner input = new Scanner(System.in);

        // prompt the user to enter Weight in Kg
        // and height in cm

        System.out.print("Please enter Weight (Kg) and Height (cm) : ");
        double weight = input.nextDouble();
        double height = input.nextDouble();
        height = height / 100;

        double bmi = weight / Math.pow(height, 2);

        bmi = (int) (bmi * 100) / 100.0;
        double standardWeight;

        System.out.print("Your BMI is " + bmi + " and you are ");

        if (bmi < 18.5) {
            // print and perform the required calculation to the needed weight gain
            System.out.println("underweight");
            standardWeight = 22.5 * Math.pow(height, 2);
            double reMeasuredWeight = standardWeight - weight;
            reMeasuredWeight = (int) (reMeasuredWeight * 100) / 100.0;
            System.out.println("Recommendation : You are underweight and you need to gain " + reMeasuredWeight + " kilograms");

        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
            System.out.println("Recommendation : Well done, keep you BMI at this level by regular exercises and eating healthy food.");

        } else if (bmi >= 25 && bmi < 30) {
            // print and perform the required calculation to get weight loss needed
            System.out.println("Overweight");
            standardWeight = 22.5 * Math.pow(height, 2);
            double reMeasuredWeight = weight - standardWeight;
            reMeasuredWeight = (int) (reMeasuredWeight * 100) / 100.0;
            System.out.println("Recommendation : You are Overweight, " +
                    "you need to exercise and watch your diet. you require to loose " + reMeasuredWeight + " kilograms");
        } else {
            // print the condition and perform the required calculation to get weight loss needed
            System.out.println("Obese");
            standardWeight = 22.5 * Math.pow(height, 2);
            double reMeasuredWeight = weight - standardWeight;
            reMeasuredWeight = (int) (reMeasuredWeight * 100) / 100.0;
            System.out.println("Recommendation : you are unfortunately obese at this stage." +
                    " keeping at this stage can cause major chronic diseases. you are urgently requiring to exercise " +
                    " and watch your diet seriously. you need to loose " + reMeasuredWeight + " kilograms");
        }
    }
}
