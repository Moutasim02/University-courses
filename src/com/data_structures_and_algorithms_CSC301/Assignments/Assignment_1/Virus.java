package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

public abstract class Virus extends ResearchLab{
    private String name;
    private String dateOfDiscovery;
    private String discoveredBy;

    abstract boolean isDeadly();
    abstract String getShape();
}
