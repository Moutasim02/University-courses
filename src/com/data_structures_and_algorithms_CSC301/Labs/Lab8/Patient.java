package com.data_structures_and_algorithms_CSC301.Labs.Lab8;

public class Patient {
    private int PatientId;
    private String Name;
    private int Age;

    @Override
    public String toString() {
        return "\nPatient{" +
                "PatientId=" + PatientId +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    public Patient(int patientId, String name, int age) {
        PatientId = patientId;
        Name = name;
        Age = age;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int patientId) {
        PatientId = patientId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

}
