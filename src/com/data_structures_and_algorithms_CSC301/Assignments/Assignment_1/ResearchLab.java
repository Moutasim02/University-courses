package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

import java.util.ArrayList;

public class ResearchLab {
    private String labCategory;
    private String labLocation;
    private int labSize;
    private static ResearchLab researchLabObject;
    private static ArrayList<ResearchLab> researchLabsList = new ArrayList<>();
    private static int counter;


    public ResearchLab() {
    }

    public ResearchLab(String category, String location, int size) {
        this.labCategory = category;
        this.labLocation = location;
        this.labSize = size;
        researchLabObject = new ResearchLab();
        researchLabObject.setLabSize(size);
        researchLabObject.setLocation(location);
        researchLabObject.setCategory(category);
        ResearchLab.researchLabsList.add(counter, researchLabObject);
        counter++;
    }

    @Override
    public String toString() {
        return "labCategory='" + labCategory + '\'' +
                ", labLocation='" + labLocation + '\'' +
                ", labSize=" + labSize;
    }

    public static ArrayList<ResearchLab> getResearchLabsList() {
        return researchLabsList;
    }

    public static void setResearchLabsList(ArrayList<ResearchLab> researchLabsList) {
        ResearchLab.researchLabsList = researchLabsList;
    }

    public String getCategory() {
        return labCategory;
    }

    public void setCategory(String category) {
        this.labCategory = category;
    }

    public String getLocation() {
        return labLocation;
    }

    public void setLocation(String location) {
        this.labLocation = location;
    }

    public int getLabSize() {
        return labSize;
    }

    public void setLabSize(int labSize) {
        this.labSize = labSize;
    }

}
