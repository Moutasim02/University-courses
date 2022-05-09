package com.programming_II_CSC202.Labs.Lab_3.task2;

// Moutasim El Ayoubi 1080415S
public class Programmer extends Employee {
    String language;
    public void printData(){
        super.printData();
        System.out.println("language: " + language);
    }
}
