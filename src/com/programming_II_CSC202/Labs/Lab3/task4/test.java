package com.programming_II_CSC202.Labs.Lab3.task4;

public class test {
    public static void main(String[] args) {
        House h1 = new House("UAE", "AbuDhabi", 33000, 5);
        House h2 = new House("UK", "London", 1890, 1);

        System.out.println(h1.toString()); // call the toString method for the objects created.
        System.out.println(h2.toString());
    }

}
