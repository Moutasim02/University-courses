package com.data_structures_and_algorithms_CSC301.Labs.Lab10;

import java.util.ArrayList;

/**
 * Moutasim El Ayoubi - 1080415
 */
public class Task2 {
    public static void main(String[] args) {
        //printing an ArrayList

        // 2.1 Complete the code below and run it.
        // 2.2 Now develop a recursive method that will print the array in reverse order from the end to start.
        ArrayList<String> AvailableCourses = new ArrayList<>();
        AvailableCourses.add("DSA");
        AvailableCourses.add("Calculus");
        AvailableCourses.add("Physics");
        AvailableCourses.add("Software engineering");
        System.out.println("The courses available are:");
        displayArray(AvailableCourses);
    }

    public static void displayArray(ArrayList<String> array) {
        displayArray(array, 0);
    }

    private static void displayArray(ArrayList<String> array, int index) {
        if (index != array.size()) {
            displayArray(array, index + 1);
            System.out.println(index + ". " + array.get(index));
        }
    }
}
