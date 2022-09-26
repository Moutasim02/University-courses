package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1.classifications;

import com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1.Virus;

public class SsDNA extends Virus {
    public SsDNA() {
    }

    public SsDNA(String virusName, String symptoms, String bodySample, String bodySystemEffect, String virusDiscoveredBy, int virusDiscoveryYear) {
        super(virusName, symptoms, bodySample, bodySystemEffect, virusDiscoveredBy, virusDiscoveryYear);
    }
}
