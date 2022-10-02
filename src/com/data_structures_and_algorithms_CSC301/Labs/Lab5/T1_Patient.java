package com.data_structures_and_algorithms_CSC301.Labs.Lab5;

class T1_Patient implements Comparable<T1_Patient> {

    int patientID;
    String name;
    int age;

    public T1_Patient(int patientID, String name, int age) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "T1_Patient{" +
                "patientID=" + patientID +
                ",  name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(T1_Patient pt) {
        if (age == pt.age) {
            return 0;
        } else if (age > pt.age) {
            return +1;
        } else {
            return -1;
        }
    }
}
