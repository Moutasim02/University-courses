package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

public abstract class Virus {
    private String virusName;
    private String symptoms;
    private String bodySample;
    private String bodySystemEffect;
    private String virusDiscoveredBy;
    private int virusDiscoveryYear;

    public Virus() {
    }

    public Virus(String virusName, String symptoms, String bodySample, String bodySystemEffect, String virusDiscoveredBy, int virusDiscoveryYear) {
        this.virusName = virusName;
        this.symptoms = symptoms;
        this.bodySample = bodySample;
        this.bodySystemEffect = bodySystemEffect;
        this.virusDiscoveredBy = virusDiscoveredBy;
        this.virusDiscoveryYear = virusDiscoveryYear;
    }

    @Override
    public String toString() {
        return "VirusAbstractClass{" +
                "  virusName='" + virusName + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", bodySample='" + bodySample + '\'' +
                ", bodySystemEffect='" + bodySystemEffect + '\'' +
                ", virusDiscoveredBy='" + virusDiscoveredBy + '\'' +
                ", virusDiscoveryYear=" + virusDiscoveryYear +
                '}';
    }

    public String getVirusName() {
        return virusName;
    }

    public void setVirusName(String virusName) {
        this.virusName = virusName;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getBodySample() {
        return bodySample;
    }

    public void setBodySample(String bodySample) {
        this.bodySample = bodySample;
    }

    public String getBodySystemEffect() {
        return bodySystemEffect;
    }

    public void setBodySystemEffect(String bodySystemEffect) {
        this.bodySystemEffect = bodySystemEffect;
    }

    public String getVirusDiscoveredBy() {
        return virusDiscoveredBy;
    }

    public void setVirusDiscoveredBy(String virusDiscoveredBy) {
        this.virusDiscoveredBy = virusDiscoveredBy;
    }

    public int getVirusDiscoveryYear() {
        return virusDiscoveryYear;
    }

    public void setVirusDiscoveryYear(int virusDiscoveryYear) {
        this.virusDiscoveryYear = virusDiscoveryYear;
    }
}
