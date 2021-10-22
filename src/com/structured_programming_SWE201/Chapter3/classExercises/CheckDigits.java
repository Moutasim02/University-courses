package com.structured_programming_SWE201.Chapter3.classExercises;

import java.util.Scanner;


public class CheckDigits {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter two digits numbers :");
        int number = in.nextInt();
        
        int firstDigit = number/10;
        int secondDigit = number % 10;
        
        System.out.println(" First digit is " +firstDigit +
                    " Second digit is " +secondDigit);
                
        
    }
    
}