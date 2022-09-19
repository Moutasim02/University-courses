package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1_copy;

public class Virus {
    private String name;
    private String dateOfDiscovery;
    private String discoveredBy;

    public Virus(String name, String dateOfDiscovery, String discoveredBy) {
        this.name = name;
        this.dateOfDiscovery = dateOfDiscovery;
        this.discoveredBy = discoveredBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfDiscovery() {
        return dateOfDiscovery;
    }

    public void setDateOfDiscovery(String dateOfDiscovery) {
        this.dateOfDiscovery = dateOfDiscovery;
    }

    public String getDiscoveredBy() {
        return discoveredBy;
    }

    public void setDiscoveredBy(String discoveredBy) {
        this.discoveredBy = discoveredBy;
    }
}
