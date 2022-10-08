package com.data_structures_and_algorithms_CSC301.Lectures.Chapter_2.Algorithms;

public class Symmetric {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 2, 3, 4};
        System.out.println(isSymmetric(arr));
    }

    private static boolean isSymmetric(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr.length - 1 - i) {
                return false; // output in this case
            }
        }
        return true;
    }
}
