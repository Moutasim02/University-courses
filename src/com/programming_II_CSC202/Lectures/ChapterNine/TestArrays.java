package com.programming_II_CSC202.Lectures.ChapterNine;

public class TestArrays {
    public static void main(String[] args) {

        int [] numbers = new int[120];
        System.out.println("Length of the array " +numbers.length);

        int x = 6;

        for ( int i = 0; i<numbers.length ;i++) {
            numbers[i] = i * x;
            x +=3;

            System.out.println(i +"\t" +numbers[i]);
        }


    }

}
