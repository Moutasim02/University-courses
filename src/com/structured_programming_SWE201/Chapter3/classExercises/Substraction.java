package com.structured_programming_SWE201.Chapter3.classExercises;

public class Substraction {
    public static void main ( String [] args ){
        
        int number1 = (int)(Math.random()* 100087565)%10;
        int number2 = (int)( Math.random()* 10007474)%10;
         System.out.println(number1+" " + number2 );
         
         System.out.print("What is " +number1 +" - " +number2 + " is ?");
         
         if ( number1 < number2){
             
             int tmp = number1;
             number1 = number2;
             number2 = tmp;
         }
          System.out.print("What is " +number1 +" - " +number2 + " is ?");
    }
    
}
    
    

