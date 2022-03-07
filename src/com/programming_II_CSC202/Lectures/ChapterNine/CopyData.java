package com.programming_II_CSC202.Lectures.ChapterNine;

public class CopyData {
    public static void main(String[] args) {

        int x = 10;
        int y = 35;

        System.out.println("x :" +x +"\t" +"y :" +y);

        x = y;

        System.out.println("x :" +x +"\t" +"y :" +y);

        y = 123;

        System.out.println("x :" +x +"\t" +"y :" +y);
    }
}
