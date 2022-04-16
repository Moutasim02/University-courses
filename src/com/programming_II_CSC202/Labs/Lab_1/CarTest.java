package com.programming_II_CSC202.Labs.Lab_1;

// Task 4  - 1080415
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "red", 100);
        Car car2 = new Car("BMW", "black", 120);
        Car car3 = new Car();

        // Task 7 - 1080415
        car1.changeColortoBlack(car1);
        car3.setColor("White");
        car3.setBrand("Bentely");
        car3.setCurrentSpeed(200);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString() + "\n");
        System.out.println(car1.getColor());

        // Task 8  - 1080415
        int x = 10;
        System.out.println("before calling the method x is " + x);
        x = modifyX(x);
        System.out.println("after calling the method x is " + x);
        }

        static int modifyX(int x) {
            x = 20;
            return x;
        }



    }

