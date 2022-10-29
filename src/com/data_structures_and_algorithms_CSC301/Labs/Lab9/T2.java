package com.data_structures_and_algorithms_CSC301.Labs.Lab9;

public class T2 {
    public static void main(String[] args) {
        // Function calling
        countFrom(3);
    }

    public static void countFrom(int number) {
        if (number == 0) {
            System.out.println(number);
        } else {
            System.out.println(number);
            countFrom(number - 1);
        }
    }
}
