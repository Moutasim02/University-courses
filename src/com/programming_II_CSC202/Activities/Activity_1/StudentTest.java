package com.programming_II_CSC202.Activities.Activity_1;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println("Name: " + st1.setName("Moutasim"));
        System.out.println("Current Year: " + st1.setYear(2));
        System.out.println("ID: " + st1.setId(1080415));
        System.out.println("Phone: " + st1.getPhone());
        System.out.println("Status: " + st1.generateStatus());
    }
}
