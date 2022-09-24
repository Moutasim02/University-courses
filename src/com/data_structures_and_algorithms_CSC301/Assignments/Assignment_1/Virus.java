package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

public class Virus extends ResearchLab {
    private boolean isDeadly;
    private String virusName;
    private String virusShape;
    private String virusDiameter;
    private String virusDiscoveredBy;
    private String virusDiscoveryDate;

    public Virus() {
    }

    public Virus(boolean isDeadly, String virusName, String virusShape, String virusDiameter, String virusDiscoveredBy, String virusDiscoveryDate) {
        this.isDeadly = isDeadly;
        this.virusName = virusName;
        this.virusShape = virusShape;
        this.virusDiameter = virusDiameter;
        this.virusDiscoveredBy = virusDiscoveredBy;
        this.virusDiscoveryDate = virusDiscoveryDate;
    }

    public Virus(String category, String location, int size, boolean isDeadly, String virusName, String virusShape,
                 String virusDiameter, String virusDiscoveredBy, String virusDiscoveryDate) {
        super(category, location, size);
        this.isDeadly = isDeadly;
        this.virusName = virusName;
        this.virusShape = virusShape;
        this.virusDiameter = virusDiameter;
        this.virusDiscoveredBy = virusDiscoveredBy;
        this.virusDiscoveryDate = virusDiscoveryDate;
    }

    // How can a virus do something?

}
