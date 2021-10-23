
package com.structured_programming_SWE201.Chapter1and2.ClassExercises;

import java.util.Scanner;

public class ReadingRadiusFromKeyBoard {

    public static void main(String[] args) {

        //2. create Scanner object

        Scanner khaled = new Scanner(System.in);

        //3. Ask (prompt) the user to enter the radius of the circle
        System.out.print("Please enter radius of the circle : ");

        //4. read the value entered by the user from the keyboard

        double radius = khaled.nextDouble();
        //5. Calculate 

        double area = radius * radius * 3.14;
        //6.Display results

        System.out.println("The area of a circle with radius of " +
                radius + " is " + area);
    }

}
