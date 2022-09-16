package com.data_structures_and_algorithms_CSC301.Labs.Lab3;

public class T5_Symmetric {
    public static void main(String[] args) {
        int[] arr = {1,4,3,4,4,3,2,1};
        System.out.println(isSymmetric(arr));
    }

    static boolean isSymmetric(int[] arr) {
        if (arr.length % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

