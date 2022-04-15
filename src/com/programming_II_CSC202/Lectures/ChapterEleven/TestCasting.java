package com.programming_II_CSC202.Lectures.ChapterEleven;

public class TestCasting {
    public static void main(String[] args) {

        double number = 15.98;

        int value = (int) (number);


        String s = new String(number + "");
        System.out.println("Number before casting is " + number);
        System.out.println("Number After casting is " + value);
        System.out.println("Number After casting to String is " + number);

    }

}
