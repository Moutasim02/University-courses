package com.programming_II_CSC202.Project;

public abstract class MedicalMapper implements Mapping{

    public abstract char convertGender(int gender);

    @Override
    public double mapBMI() {
        return 0;
    }

    @Override
    public int mapBloodPressure() {
        return 0;
    }

    @Override
    public int mapFBS(double fbs) {
        return 0;
    }

    @Override
    public int mapCholesterol(double chol) {
        return 0;
    }

    @Override
    public int mapHDL(double hdl) {
        return 0;
    }

    @Override
    public int mapLDL(double ldl) {
        return 0;
    }

    @Override
    public int getTG(double tg) {
        return 0;
    }

    @Override
    public int mapHB1AC(double hb1ac) {
        return 0;
    }
}
