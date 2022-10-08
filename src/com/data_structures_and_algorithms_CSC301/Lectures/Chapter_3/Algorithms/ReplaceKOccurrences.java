package com.data_structures_and_algorithms_CSC301.Lectures.Chapter_3.Algorithms;

import java.util.Arrays;

// Replace First k occurrences of 100 in the array of size N
public class ReplaceKOccurrences {
    public static void main(String[] args) {
        int[] myArray = {23, 345, 56, 23, 100, 34, 0, 100, 2, 100, 100, 100};
        int k = 3;
        int newValue = 5;
        System.out.println("Before\n" + Arrays.toString(myArray));
        replaceFirstK(myArray, k, newValue);
        System.out.println("After\n" + Arrays.toString(myArray));
    }

    private static void replaceFirstK(int[] myArray, int k, int newValue) {
        int counter = 0;
        int i = 0;
        while (counter < k && i < myArray.length) {
            if (myArray[i] == 100) {
                myArray[i] = newValue;
                counter++;
            }
            i++;
        }
    }
}
