package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;


public class Virus extends VirusAbstractClass {

    public Virus() {
    }

    public Virus(int labIndex, String virusName, String symptoms, String bodySample, String bodySystemEffect, String virusDiscoveredBy, int virusDiscoveryYear) {
        super(labIndex, virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear);
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
