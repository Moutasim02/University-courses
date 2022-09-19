package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

import java.util.ArrayList;

public class ResearchLab {
    private String category;
    private String location;
    private int size;
    private static ResearchLab researchLabObject;
    static ArrayList<ResearchLab> researchLabsList = new ArrayList<>();
    private static int counter;


    public ResearchLab() {

    }

    public ResearchLab(String category, String location, int size) {
        this.category = category;
        this.location = location;
        this.size = size;
        researchLabObject = new ResearchLab();
        researchLabObject.setSize(size);
        researchLabObject.setLocation(location);
        researchLabObject.setCategory(category);
        ResearchLab.researchLabsList.add(counter, researchLabObject);
        counter++;
    }

    public static ArrayList<ResearchLab> getResearchLabsList() {
        return researchLabsList;
    }

    public static void setResearchLabsList(ArrayList<ResearchLab> researchLabsList) {
        ResearchLab.researchLabsList = researchLabsList;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
