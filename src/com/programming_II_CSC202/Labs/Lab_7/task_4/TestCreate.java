package com.programming_II_CSC202.Labs.Lab_7.task_4;

public class TestCreate {
    public static void main(String[] args) throws Exception {

        java.io.File file = new java.io.File("cars.txt"); // create a text file called cars
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Write formatted output to the file
        output.print("Toyota "); //model name
        output.println(100000);           //price
        output.println("pink");            //color
        output.print("BMW ");
        output.println(20000);
        output.println("black");

        // Close the file
        output.close();
    }
}
