package com.programming_II_CSC202.Project;

import com.programming_II_CSC202.Project.MethodOne.Mapping;

public class MedicalMapper extends Laboratory implements Mapping, Comparable<MedicalMapper> {

    MedicalMapper() {
    }
    public char convertGender(int gender) {
        if (getGender() == 1)
            return 'M';
        else if (getGender() == 2) {
            return 'F';
        }
        return 'E';
    }

    @Override
    public double mapBMI() {
        if (getBMI() >= 0 && getBMI() <= 17.9) {
            return 0;
        } else if (getBMI() >= 18 && getBMI() <= 24.9) {
            return 1;
        } else if (getBMI() >= 25 && getBMI() <= 29.9) {
            return 2;
        } else if (getBMI() >= 30 && getBMI() <= 100) {
            return 3;
        }
        return 0;
    }


    @Override
    public int mapBloodPressure() {
        if (getSbp() < 130 && getDbp() < 80) {
            return 1;
        } else if (getSbp() <= 130 && getDbp() >= 80) {
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
            return 1;
        } else if (fbs >= 111 && fbs <= 140) {
            return 2;
        } else if (fbs >= 141 && fbs <= 200) {
            return 3;
        } else if (fbs >= 201 && fbs <= 300) {
            return 4;
        } else if (fbs >= 301 && fbs <= 400) {
            return 5;
        }
        return 0;
    }

    @Override
    public int mapCholesterol(double chol) {
        if (getChol() >= 50 && getChol() <= 149) {
            return 1;
        } else if (getChol() >= 150 && getChol() <= 184) {
            return 2;
        } else if (getChol() >= 185 && getChol() <= 199) {
            return 3;
        } else if (getChol() >= 200 && getChol() <= 249) {
            return 4;
        } else if (getChol() >= 250 && getChol() <= 500) {
            return 5;
        }
        return 0;
    }

    @Override
    public int mapHDL(double hdl) {
        if (getHdl() >= 0 && getHdl() <= 39) {
            return 5;
        } else if (getHdl() >= 40 && getHdl() <=59) {
            return 4;
        } else if (getHdl() >= 60 && getHdl() <= 74) {
            return 3;
        } else if (getHdl() >= 75 && getHdl() <= 99) {
            return 2;
        } else if (getHdl() >= 100 && getHdl() <= 200) {
            return 1;
        }
        return 0;
    }

    @Override
    public int mapLDL(double ldl) {
        if (getLdl() >= 0 && getLdl() <= 99) {
            return 1;
        } else if (getLdl() >= 100 && getLdl() <= 129) {
            return 2;
        } else if (getLdl() >= 130 && getLdl() <= 159) {
            return 3;
        } else if (getLdl() >= 160 && getLdl() <= 189) {
            return 4;
        } else if (getLdl() >= 190 && getLdl() <= 500) {
            return 5;
        }
        return 0;
    }

    @Override
    public int getTG(double tg) {
        if (tg >= 0 && tg <= 149) {
            return 1;
        } else if (tg >= 150 && tg <= 179) {
            return 2;
        } else if (tg >= 180 && tg <= 199) {
            return 3;
        } else if (tg >= 200 && tg <= 499) {
            return 4;
        } else if (tg >= 500 && tg <= 1000) {
            return 5;
        }
        return 0;
    }

    @Override
    public int mapHB1AC(double hb1ac) {
        if (getHba1c() >= 4 && getHba1c() <= 6) {
            return 1;
        } else if (getHba1c() >= 6.1 && getHba1c() <= 7) {
            return 2;
        } else if (getHba1c() >= 7.1 && getHba1c() <= 8) {
            return 3;
        } else if (getHba1c() >= 8.1 && getHba1c() <= 9) {
            return 4;
        } else if (getHba1c() >= 9.1 && getHba1c() <= 20) {
            return 5;
        }
        return 0;
    }

    public int getTotal() {
        return (int) (mapBMI() + mapBloodPressure() + mapFBS(getFbs()) + mapCholesterol(getChol()) + mapHDL(getHdl()) + getTG(getTg()) + mapLDL(getLdl()) + mapHB1AC(getHba1c()));
    }

    @Override
    public String toString() {
        return getPid() + " " + getAge() + " " + convertGender(getGender()) + " " + (int) (mapBMI()) + " " + mapBloodPressure() +
                " " + mapFBS(getFbs()) + " " + mapCholesterol(getChol()) + " " + mapLDL(getLdl()) + " " + mapHDL(getHdl()) + " " + getTG(getTg()) + " " + mapHB1AC(getHba1c()) + " " + getTotal();
    }

    @Override
    public int compareTo(MedicalMapper o) {
        return this.getTotal() - o.getTotal();
    }
}
