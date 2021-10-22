package com.structured_programming_SWE201.Chapter4.ClassExercises;

public class TestString {
    public static void main ( String [] args){
        
        String msg = "Good Afternoon Everybody";
        System.out.println("Number of characters is " +msg.length());
        String ss = msg.trim();
        String msg2 = ss +" and have a nice day";
        System.out.println("Number of characters is " +ss.length());
        System.out.println("Character at 5 " +msg.charAt(5));
        System.out.println("Convert String to upper case " +msg.toUpperCase());
        System.out.println("Convert String to lower case " +msg.toLowerCase());
        System.out.println("new message is " +msg2);
    }
    
}