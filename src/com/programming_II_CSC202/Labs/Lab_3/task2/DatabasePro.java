package com.programming_II_CSC202.Labs.Lab_3.task2;

// Moutasim El Ayoubi 1080415
public class DatabasePro extends Employee {
    String databaseTool;
    public void printData(){
        //call the printData method from the super class
        super.printData();
        System.out.println("Database Tool: " + databaseTool);
    }
}
