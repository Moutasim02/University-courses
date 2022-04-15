package com.programming_II_CSC202.Assignments.AssignmentOne;

public final class Owner {

    private int id = 0;
    private String name;
    private String address;

    public Owner(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
