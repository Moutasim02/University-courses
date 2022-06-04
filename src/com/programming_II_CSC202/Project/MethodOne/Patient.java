package com.programming_II_CSC202.Project.MethodOne;

public class Patient {
    private int pid;
    private int age;
    private int gender;
    private double height;
    private double weight;

    public Patient() {
    }

    public Patient(int pid, int age, int gender, double height, double weight) {
        this.pid = pid;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }


    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBMI() {
        return (int) (weight / Math.pow((height * 0.01),2) * 10) / 10.0;
    }
}
