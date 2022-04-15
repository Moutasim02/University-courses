package com.programming_II_CSC202.Labs.Lab3.task3;

public class Employee  extends Person{
    public Employee() {
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
    }
    public Employee(String s) {
        System.out.println(s);
    }
}
