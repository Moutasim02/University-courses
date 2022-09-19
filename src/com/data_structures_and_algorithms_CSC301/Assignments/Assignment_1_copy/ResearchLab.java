package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1_copy;


public class ResearchLab {
    private String category;
    private String location;
    private int size;

    public ResearchLab() {

    }

    public ResearchLab(String category, String location, int size) {
        this.category = category;
        this.location = location;
        this.size = size;
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
