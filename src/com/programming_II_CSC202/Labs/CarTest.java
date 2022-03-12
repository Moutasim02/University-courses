package com.programming_II_CSC202.Labs;

public class CarTest {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", "black", 40);
        Car tesla = new Car("Tesla", "White", 120);
        Car porsche = new Car("Porche", "Red", 50);

        System.out.println(mercedes.increaseSpeed(50));


        System.out.println(tesla.increaseSpeed(120));
        System.out.println(tesla.color);
        System.out.println(porsche.color);
        System.out.println(mercedes.color);
        System.out.println("----------");

        tesla = porsche;
        System.out.println(tesla.color);
        System.out.println(porsche.color);
        System.out.println(mercedes.color);
        System.out.println("----------");

        porsche.color ="gold";
        System.out.println(tesla.color);
        System.out.println(porsche.color);
        System.out.println("----------");

        int i = 1;
        int j = i;
        j = 3;
        System.out.println(i +"\t" + j);
    }
}
