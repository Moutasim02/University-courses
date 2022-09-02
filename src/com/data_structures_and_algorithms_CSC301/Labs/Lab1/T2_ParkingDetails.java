package com.data_structures_and_algorithms_CSC301.Labs.Lab1;

/**
 * Moutasim El Ayoubi - 1080415
 */

public class T2_ParkingDetails extends T1_PlateDetails {
    private int validityTime; // 1, 2, 3, etc.
    private String parkingType; // Standard, Premium

    public T2_ParkingDetails() {
    }

    public T2_ParkingDetails(String plateSource, String plateType, String plateColor, int plateNumber, int validityTime, String parkingType) {
        super(plateSource, plateType, plateColor, plateNumber);
        this.validityTime = validityTime;
        this.parkingType = parkingType;
    }

    public T2_ParkingDetails(int validityTime, String parkingType) {
        this.validityTime = validityTime;
        this.parkingType = parkingType;
    }

    public T2_ParkingDetails(int plateNumber, int validityTime, String parkingType) {
        super(plateNumber);
        this.validityTime = validityTime;
        this.parkingType = parkingType;
    }

    public void briefDetailsOnTerminal() {
        System.out.println("Plate Type: " + getPlateType() + "Plate number: " + getPlateNumber());
    }


    @Override
    public String toString() {
        return "validityTime=" + validityTime +
                ", parkingType='" + parkingType;
    }
}
