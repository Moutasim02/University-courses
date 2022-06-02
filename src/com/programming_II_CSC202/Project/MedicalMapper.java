package com.programming_II_CSC202.Project;

public class MedicalMapper extends Laboratory implements Comparable<MedicalMapper> {
    private int mapFBS;
    private int mapCholestrol;
    private int mapHDL;
    private int mapLDL;
    private int mapTG;
    private int mapHB1AC;
    private char mapGender;

    MedicalMapper(){}
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

    public int getMapTG() {
        return mapTG;
    }

    public void setMapTG(int mapTG) {
        this.mapTG = mapTG;
    }

    public int getMapHB1AC() {
        return mapHB1AC;
    }

    public void setMapHB1AC(int mapHB1AC) {
        this.mapHB1AC = mapHB1AC;
    }

    public char getMapGender() {
        return mapGender;
    }

    public void setMapGender(char mapGender) {
        this.mapGender = mapGender;
    }

    public char convertGender(int gender) {
        if (getGender() == 1)
            mapGender = 'M';
        else if (getGender() == 2) {
            mapGender = 'F';
        }
        return mapGender;
    }

    @Override
    public double mapBMI(double bmi) {
        if (getBMI() >= 0 && getBMI() <= 17.9) {
            return 0;
        } else if (getBMI() >= 18 && getBMI()<= 24.9) {
            return 1;
        } else if (getBMI() >= 25 && getBMI() <= 29.9) {
            return 2;
        } else if (getBMI() >= 30 && getBMI() <= 100){
            return 3;
        }
        return bmi;
    }

    @Override
    public int mapBloodPressure() {
        if (getSbp() < 130 && getDbp() < 80) {
            return 1;
        } else if (getSbp() <= 80 && getDbp() <= 130) {
            return 2;
        } else if (getSbp() > 130 && getDbp() < 100) {
            return 3;
        } else if (getSbp() > 150 && getDbp() > 100) {
            return 4;
        } else {
            return 5;
        }
    }

    @Override
    public int mapFBS(double fbs) {

        if (fbs >= 70 && fbs <= 110) {
            this.mapFBS = 1;
        } else if (fbs >= 111 && fbs <= 140) {
            this.mapFBS = 2;
        } else if (fbs >= 141 && fbs <= 200) {
            this.mapFBS = 3;
        } else if (fbs >= 201 && fbs <= 300) {
            this.mapFBS = 4;
        } else if (fbs >= 301 && fbs <= 400) {
            this.mapFBS = 5;
        }
        return mapFBS;
    }

    @Override
    public int mapCholesterol(double chol) {
        if (getChol() >= 50 && getChol() <= 149) {
            this.mapCholestrol = 1;
        } else if (getChol() >= 150 && getChol() <= 184) {
            this.mapCholestrol = 2;
        } else if (getChol() >= 185 && getChol() <= 199) {
            this.mapCholestrol = 3;
        } else if (getChol() >= 200 && getChol() <= 249) {
            this.mapCholestrol = 4;
        } else if (getChol() >= 250 && getChol() <= 500) {
            this.mapCholestrol = 5;
        }
        return mapCholestrol;
    }

    @Override
    public int mapHDL(double hdl) {
        if (getHdl() >= 0 && getHdl() <= 39) {
            this.mapHDL = 5;
        } else if (getHdl() >= 40 && getHdl() <= 59) {
            this.mapHDL = 4;
        } else if (getHdl() >= 60 && getHdl() <= 74) {
            this.mapHDL = 3;
        } else if (getHdl() >= 75 && getHdl() <= 99) {
            this.mapHDL = 2;
        } else if (getHdl() >= 100 && getHdl() <= 200) {
            this.mapHDL = 1;
        }
        return mapHDL;
    }

    @Override
    public int mapLDL(double ldl) {
        if (getLdl() >= 0 && getLdl() <= 99) {
            this.mapLDL = 1;
        } else if (getLdl() >= 100 && getLdl() <= 129) {
            this.mapLDL = 2;
        } else if (getLdl() >= 130 && getLdl() <= 159) {
            this.mapLDL = 3;
        } else if (getLdl() >= 160 && getLdl() <= 189) {
            this.mapLDL = 4;
        } else if (getLdl() >= 190 && getLdl() <= 500) {
            this.mapLDL = 5;
        }
        return mapLDL;
    }

    @Override
    public int getTG(double tg) {
        if (tg >= 0 && tg <= 149) {
            this.mapTG = 1;
        } else if (tg >= 150 && tg <= 179) {
            this.mapTG = 2;
        } else if (tg >= 180 && tg <= 199) {
            this.mapTG = 3;
        } else if (tg >= 200 && tg <= 499) {
            this.mapTG = 4;
        } else if (tg >= 500 && tg <= 1000) {
            this.mapTG = 5;
        }
        return mapTG;
    }

    @Override
    public int mapHB1AC(double hb1ac) {
        if (getHba1c() >= 4 && getHba1c() <= 6) {
            this.mapHB1AC = 1;
        } else if (getHba1c() >= 6.1 && getHba1c() <= 7) {
            this.mapHB1AC = 2;
        } else if (getHba1c() >= 7.1 && getHba1c() <= 8) {
            this.mapHB1AC = 3;
        } else if (getHba1c() >= 8.1 && getHba1c() <= 9) {
            this.mapHB1AC = 4;
        } else if (getHba1c() >= 9.1 && getHba1c() <= 20) {
            this.mapHB1AC = 5;
        }
        return mapHB1AC;
    }

    public int getTotal() {
        return (int) (mapBMI(getBMI())) + mapBloodPressure() + mapFBS +
                mapCholestrol + mapHDL + mapLDL + mapTG + mapHB1AC;
    }

    @Override
    public String toString() {
        return getPid() + " " + getAge() + " " + convertGender((char) getGender()) + " " + mapBMI(getBMI()) +
                " " + getSbp() + " " + getDbp() + " " + getFbs() + " " + getChol() + " " +  getLdl() + " " + getHdl() + " " + getTg() + " " + getHba1c();
    }

    @Override
    public int compareTo(MedicalMapper o) {
        return 0;
    }
}
