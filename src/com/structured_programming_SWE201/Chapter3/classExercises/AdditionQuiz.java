package com.structured_programming_SWE201.Chapter3.classExercises;
import java.util.Scanner;

public class AdditionQuiz {
    
    public static void main (String [] args) {
       int number1 = (int)((Math.random()*1089498) % 10); // first it will give us 0 then times any number
       // and put remainder to have whole number 
    int number2 = (int)(System.currentTimeMillis() / 10 %10 );
    
    System.out.println(number1+" " + number2 );

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print(
      "What is " + number1 + " + " + number2 + "? ");
    int ans = number1 + number2;  // the real answer

    int answer = input.nextInt();
    
    if ( answer == ans ){
        System.out.println("Correct -- Well done");
    }
    else {
        System.out.println("OOOPS -- Wrong");
    }
    
} 
        
    }
    
