package com.programming_II_CSC202.Labs.Lab_2;

public class Test {
    public static void main(String[] args) {
//        char[] Myarray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
//        String msg = new String(Myarray);
//        System.out.println(msg);
//
//        System.out.println("Welcome".replaceFirst("e", "AB"));
//        System.out.println("Welcome".replace("e", "AB"));
//        System.out.println("Welcome".replace("el", "AB"));
//
//        String[] myMessage = "Welcome_to_Dubai_Expo_2020".split("_");
//        for (int i = 0; i < myMessage.length; i++)
//            System.out.println(myMessage[i] + " ");

        String[] myMessage = "Welcome_to?Dubai,Expo_2020".split("[?_,]");
        for (int i = 0; i < myMessage.length; i++)
            System.out.println(myMessage[i] + " ");
    }
}