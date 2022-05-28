package com.programming_II_CSC202.Project;

public class MedicalMapper extends Laboratory implements Comparable<MedicalMapper> {
    private int mapFBS;
    private int mapCholestrol;
    private int mapHDL;
    private int mapLDL;
    private int getTG;
    private int mapHB1AC;

    public int getMapFBS() {
        return mapFBS;
    }

    public void setMapFBS(int mapFBS) {
        this.mapFBS = mapFBS;
    }

    public int getMapCholestrol() {
        return mapCholestrol;
    }

    public void setMapCholestrol(int mapCholestrol) {
        this.mapCholestrol = mapCholestrol;
    }

    public int getMapHDL() {
        return mapHDL;
    }

    public void setMapHDL(int mapHDL) {
        this.mapHDL = mapHDL;
    }

    public int getMapLDL() {
        return mapLDL;
    }

    public void setMapLDL(int mapLDL) {
        this.mapLDL = mapLDL;
    }

    public int getGetTG() {
        return getTG;
    }

    public void setGetTG(int getTG) {
        this.getTG = getTG;
    }

    public int getMapHB1AC() {
        return mapHB1AC;
    }

    public void setMapHB1AC(int mapHB1AC) {
        this.mapHB1AC = mapHB1AC;
    }

    @Override
    public double mapBMI() {
        if (getBMI() >= 0 && getBMI() <= 17.9){
            return 0;
        }
        else if (getBMI() >= 18 && getBMI() <= 24.9){
            return 1;
        }
        else if (getBMI() >= 25 && getBMI() <= 29.9){
            return 2;
        }
        else {
            return 3;
        }
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

    @Override
    public int compareTo(MedicalMapper o) {
        return 0;
    }
}
