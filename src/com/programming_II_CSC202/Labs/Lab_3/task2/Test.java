package com.programming_II_CSC202.Labs.Lab_3.task2;

// Moutasim El Ayoubi 1080415
public class Test {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Emily";
        e.age = 45;
        e.salary = 65520.00;

        Programmer p = new Programmer();
        p.name = "Ben";
        p.age = 37;
        p.salary = 77435.00;
        p.language = "Java";

        DatabasePro d = new DatabasePro();
        d.name = "Jack";
        d.age = 28;
        d.salary = 45000.00;
        d.databaseTool = "My SQL";

        e.printData();
        p.printData();
        d.printData();
    }
}
