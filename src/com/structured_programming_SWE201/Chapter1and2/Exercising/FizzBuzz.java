package com.structured_programming_SWE201.Chapter1and2.Exercising;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        while (number <= 100) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
            number++;
        }
    }
}
