
package com.structured_programming_SWE201.Chapter4.ClassExercises;
import java.util.Scanner;


public class ReadingString {
    
    public static void main ( String [] args){
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter a sentence : ");
         
         String statment = input.nextLine();
         
         
         System.out.println("Your name is : " +statment.length() );
         
         System.out.println(statment.substring(0, 10));
         System.out.println(statment.substring(3));
    }
    
}