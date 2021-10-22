package com.structured_programming_SWE201.Chapter3.classExercises;
import java.util.Scanner;

public class PositiveOrNegative {
    public static void main ( String [] args) {
        
        Scanner input = new Scanner ( System.in);
        
        System.out.print("Please enter a number : ");
        
        int number = input.nextInt();
        
        if ( number > 0){
            System.out.println("The number you entered is POSITIVE ");
        }
        else if ( number < 0 ) {
             System.out.println("The numnumber < 0 ) ber you entered is NEGATIVE ");
        }
        else {
            System.out.println("The number you entered is ZERO ");
        }
        
    }
    
}