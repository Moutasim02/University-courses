package com.programming_II_CSC202.Project;

public interface Mapping {
    double mapBMI(); //to map the calculated BMI ( via getBMI() method ) in to a mapping values
    int mapBloodPressure(); // maps the sbp and dbp
    int mapFBS(double fbs); // map fbs attribute
    int mapCholesterol(double chol); // to convert the chol attribute
    int mapHDL(double hdl); // to convert the attribute hdl
    int mapLDL(double ldl); // to convert ld
    int getTG(double tg); // to map TG
    int mapHB1AC(double hb1ac); // to map hba1c attribute
}
