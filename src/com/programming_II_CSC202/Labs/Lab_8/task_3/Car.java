package com.programming_II_CSC202.Labs.Lab_8.task_3;


public class Car implements Comparable<Car> {
    private String name;
    private int speed;

    public Car() {
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int compareTo(Car o) {
        if (this.getName() == o.getName()) return 0;
        else if (this.getSpeed() == o.getSpeed())return 1;
        else return -1;
    }
}
