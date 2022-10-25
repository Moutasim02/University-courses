package com.data_structures_and_algorithms_CSC301.Labs.Lab8;

import java.util.ArrayList;

public class Hospital {
    private String hospitalName;
    private String location;
    private int branchNumber;
    private ArrayList<MedicalRecord> medicalRecords = new ArrayList<>();

    public Hospital(String hospitalName, String location, int branchNumber) {
        this.hospitalName = hospitalName;
        this.location = location;
        this.branchNumber = branchNumber;
    }

    @Override
    public String toString() {
        return "\nHospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", location='" + location + '\'' +
                ", branchNumber=" + branchNumber +
                ", medicalRecords=" + medicalRecords +
                '}';
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public ArrayList<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(ArrayList<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }
}
