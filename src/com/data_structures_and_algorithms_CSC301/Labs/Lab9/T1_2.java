package com.data_structures_and_algorithms_CSC301.Labs.Lab9;

public class T1_2 {
    public static void main(String[] args) {
        System.out.println("First 50 Natural Numbers are:");
        // Function calling
        numPrint(1);
    }

    static void numPrint(int n) {
        if(n != 51)
        {
            System.out.println(n);
            numPrint(n + 1);
        }
    }
}


