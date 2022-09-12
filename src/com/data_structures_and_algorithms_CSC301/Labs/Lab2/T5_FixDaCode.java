package com.data_structures_and_algorithms_CSC301.Labs.Lab2;

public class T5_FixDaCode {
    public static void main(String[] args) {
        System.out.println(FineDiscount(980));

        int[] myList = new int[12];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 101);
        }

        //printing out the array elements
        for (int j = 0; j < myList.length; j++) {
            System.out.println(myList[j]);
        }
    }

    public static double FineDiscount(double price) {
        return price * 0.05;
    }
}
