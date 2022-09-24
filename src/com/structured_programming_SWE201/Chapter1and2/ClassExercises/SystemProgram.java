
package com.structured_programming_SWE201.Chapter1and2.ClassExercises;


import java.util.Scanner;

public class SystemProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("first number: ");
        int x = scanner.nextInt();
        System.out.println("second number: ");
        int y = scanner.nextInt();
        int var = x + y;
        System.out.println(var);
    }

}