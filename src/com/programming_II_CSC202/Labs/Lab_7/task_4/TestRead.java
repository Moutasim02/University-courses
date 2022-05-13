package com.programming_II_CSC202.Labs.Lab_7.task_4;

import java.util.Scanner;

public class TestRead {
    public static void main(String[] args) throws java.io.IOException {
        java.io.File file = new java.io.File("cars.txt");

        // Create a Scanner for the file and name it input
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            String ModelName = input.next();
            int Price = input.nextInt();
            String Color = input.next();
            System.out.println(
                    ModelName + " " + Price + " " + Color);
        }

        // Close the file
        input.close();
    }
}
