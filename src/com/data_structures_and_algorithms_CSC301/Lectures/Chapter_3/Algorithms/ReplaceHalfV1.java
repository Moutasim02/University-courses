package com.data_structures_and_algorithms_CSC301.Lectures.Chapter_3.Algorithms;

import java.util.Arrays;

public class ReplaceHalfV1 {
    public static void main(String[] args) {
        int[] myArray = {23, 345, 56, 23, 100, 34, 0, 100, 2, 100, 100, 100};
        int oldValue = 100;
        int newValue = 16;
        System.out.println("Before\n" + Arrays.toString(myArray));
        replaceHalfV1(myArray, oldValue, newValue);
        System.out.println("After\n" + Arrays.toString(myArray));
    }

    private static void replaceHalfV1(int[] myArray, int oldValue, int newValue) {
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == oldValue) {
                counter++;
            }
        }
        counter = counter / 2;
        for (int i = 0; counter > 0; i++) {
            if (myArray[i] == oldValue) {
                myArray[i] = newValue;
                counter--;
            }
        }
    }
}
