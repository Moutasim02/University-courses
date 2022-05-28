package com.programming_II_CSC202.Project;

public class Patient {
    private int pid;
    private int age;
    private double gender;
    private double height;
    private double weight;

    public Patient() {
    }

    public Patient(int pid, int age, double gender, double height, double weight) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGender() {
        return gender;
    }

    public void setGender(double gender) {
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
        return weight / Math.pow((height * 0.01),2);
    }
}
