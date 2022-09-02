package com.data_structures_and_algorithms_CSC301.Labs.Lab1;

/**
 * Moutasim El Ayoubi - 1080415
 */

public class T1_PlateDetails {
    private String plateSource; // Abu Dhabi, Dubai, etc.
    private String plateType; // Private, Public, Export, Diplomatic, etc.
    private String plateColor; // Green, Blue, Grey, etc.
    private int plateNumber; // number only

    public T1_PlateDetails() {
    }

    public void briefDetailsOnTerminal() {
        System.out.println("Plate Color: " + getPlateColor() + "Plate number: " + getPlateNumber());
    }

    public void showPlateNumber() {
        System.out.println("This is the plate number: " + getPlateNumber());
    }

    public T1_PlateDetails(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public T1_PlateDetails(String plateSource, String plateType, String plateColor, int plateNumber) {
        this.plateSource = plateSource;
        this.plateType = plateType;
        this.plateColor = plateColor;
        this.plateNumber = plateNumber;
    }

    public String getPlateSource() {
        return plateSource;
    }

    public void setPlateSource(String plateSource) {
        this.plateSource = plateSource;
    }

    public String getPlateType() {
        return plateType;
    }

    public void setPlateType(String plateType) {
        this.plateType = plateType;
    }

    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return "Plate Source: " + getPlateSource()
                + "\nPlate Type: " + getPlateType()
                + "\nPlate Color: " + getPlateColor()
                + "\nPlate Number: " + getPlateNumber();
    }
}
