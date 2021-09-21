package com.structured_programming_SWE201.Chapter1and2.ClassExercises;
import java.util.Scanner;

public class TwoDigits {
    
    public static void main ( String [] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a double number : ");
        
        double number = input.nextDouble();
        
        System.out.println("Number with only two digits is " +
             (int)(number*100)/100.0);
    }
    
}
    

