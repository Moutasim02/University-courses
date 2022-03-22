package com.programming_II_CSC202.Assignments.AssignmentOne;

public class Owner {
    private int id = 0;
    private String name;
    private String address;

    public Owner() {
        // Default constructor to make the class mutable
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
