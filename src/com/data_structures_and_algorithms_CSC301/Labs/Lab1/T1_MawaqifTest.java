package com.data_structures_and_algorithms_CSC301.Labs.Lab1;


/**
 * Moutasim El Ayoubi - 1080415
 */

public class T1_MawaqifTest {
    public static void main(String[] args) {
        T1_PlateDetails mawaqif1 = new T1_PlateDetails("Abu Dhabi", "Private", "Red", 23475);
        System.out.println("\n" + mawaqif1);

        T1_PlateDetails mawaqif2 = new T2_ParkingDetails("Dubai", "Public", "Blue", 23978, 1, "Standard");
        System.out.println("\n" + mawaqif2);

        T2_ParkingDetails mawaqif3 = new T2_ParkingDetails(3, "Premium");
        mawaqif3.setPlateColor("Red");
        mawaqif3.setPlateNumber(23763);
        System.out.println("\n" + mawaqif3);

        System.out.println();
        mawaqif1.briefDetailsOnTerminal();
        mawaqif2.briefDetailsOnTerminal();
        mawaqif3.briefDetailsOnTerminal();

        System.out.println();
        System.out.println(mawaqif1 instanceof T1_PlateDetails);
        System.out.println(mawaqif2 instanceof T1_PlateDetails);
        System.out.println(mawaqif3 instanceof T1_PlateDetails);
        System.out.println(mawaqif1 instanceof T2_ParkingDetails);
        System.out.println(mawaqif2 instanceof T2_ParkingDetails);
        System.out.println(mawaqif3 instanceof T2_ParkingDetails);
        System.out.println();

        mawaqif3.showPlateNumber();
    }
}
