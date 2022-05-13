package com.programming_II_CSC202.Labs.Lab_7.task_3;

public class Test {
    public static void main(String args[]) {
        int[] num = new int[5]; //Array of 5 elements is made
        try {
            System.out.println("before");
            num[9] = 5; // set the 9th element to the value 5

            System.out.println("after");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("inside the catch");
        }
    }
}