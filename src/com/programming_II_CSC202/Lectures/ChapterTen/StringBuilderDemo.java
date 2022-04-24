package com.programming_II_CSC202.Lectures.ChapterTen;

public class StringBuilderDemo {
    public static void main (String[] args){
        //StringBuilder and StringBuffer are more flexible than String
        //the default length for StringBuilder 16 characters
        StringBuilder x = new StringBuilder();
        //append
        x.append("Welcome");
        x.append(" ");
        x.append("to");
        x.append(" ");
        x.append("Java");
        System.out.println(x);
        //insert
        x.insert(11, "HTML#and#");
        System.out.println(x);
        //delete
        x.delete(11, 20); //means it will delete from 12 to 20
        System.out.println(x);
        //deleteCharAt
        x.deleteCharAt(1);
        System.out.println(x);
        //setCharAt
        x.setCharAt(1, 'e');
        System.out.println(x);
        //reverse
        //x.reverse();
        //System.out.println(x);
        //replace
        x.replace(11, 14, "C++ and");//means it will replace from 12 to 14
        System.out.println(x);
        //capacity
        System.out.println(x.capacity());
        //length
        System.out.println(x.length());
        //charAt
        System.out.println(x.charAt(0));
        //setLength
        x.setLength(2);
        System.out.println(x);
        x.setLength(150);
        System.out.println(x);
    }
}
