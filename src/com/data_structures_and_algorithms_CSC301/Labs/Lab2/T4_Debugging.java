package com.data_structures_and_algorithms_CSC301.Labs.Lab2;

public class T4_Debugging {
    public static void main(String[] args) {
        System.out.println("Average number of accidents in a week");
        double avg = findAverage(args);
        System.out.println("The average this week is " + avg);
    }

    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result / input.length;
    }

}
