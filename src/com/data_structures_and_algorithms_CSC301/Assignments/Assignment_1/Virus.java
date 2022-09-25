package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;


public class Virus extends VirusAbstractClass {

    public Virus() {
    }

    public Virus(String virusName, String symptoms, String bodySample, String virusDiameter,
                 String bodySystemEffect, String virusDiscoveredBy, String virusDiscoveryYear) {
        super(virusName, symptoms, bodySample, virusDiameter, bodySystemEffect, virusDiscoveredBy,
                virusDiscoveryYear);
    }

    @Override
    boolean search4Virus(String virusName) {
        if (getViruses().contains(virusName)) {
            return true;
        } else {
            return false;
        }
    }
}
