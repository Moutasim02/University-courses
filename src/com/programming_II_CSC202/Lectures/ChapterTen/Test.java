package com.programming_II_CSC202.Lectures.ChapterTen;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String to check for palindrome: ");
        String A=sc.next();
        String reversedString = "";
        char character;

        for (int i = 0; i < A.length(); i++) {
            character = A.charAt(i);
            reversedString = character + reversedString;
        }
        System.out.println(reversedString);
        if (A.equals(reversedString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
