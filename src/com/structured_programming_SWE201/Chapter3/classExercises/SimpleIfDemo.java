package com.structured_programming_SWE201.Chapter3.classExercises;
import java.util.Scanner;


public class SimpleIfDemo {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        //prompt the user to enter a number
        
        System.out.print("Please enter an integer number : ");
        
        int number = input.nextInt();
        
        //is the number a multiply of 5
        if ( number % 5 == 0){
            System.out.println("Hi Five");
        }
        
        // is the number is deivisable by 2 ( EVEN )
        
        if ( number % 2 == 0){
            
            System.out.println("Hi Even");
        }
            
    }
    
}

