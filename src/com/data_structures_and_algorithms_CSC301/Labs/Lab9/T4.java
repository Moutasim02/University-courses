package com.data_structures_and_algorithms_CSC301.Labs.Lab9;

public class T4 {
    public static void main(String[] args) {
        //create an int Array and Assign it elements of your choice
        //initialize the size of Array
        int[] arr = {5, 1, 9, 10, 50, 44, 100, 43, 32};
        // Function calling
        System.out.println(findMaxRec(arr, arr.length));
    }

    public static int findMaxRec(int[] a, int n) {
        if(n == 1)
            return a[0];

        return Math.max(a[n-1], findMaxRec(a, n - 1));
    }
}

