package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

import java.util.ArrayList;

public abstract class VirusAbstractClass {
    private static int counter;
    private static ArrayList<Virus> viruses = new ArrayList<>();
    private Virus virus;
    private String virusName;
    private String symptoms;
    private String bodySample;
    private String virusDiameter;
    private String bodySystemEffect;
    private String virusDiscoveredBy;
    private String virusDiscoveryYear;

    public VirusAbstractClass() {
    }

    public VirusAbstractClass(String virusName, String symptoms, String bodySample, String virusDiameter,
                              String bodySystemEffect, String virusDiscoveredBy, String virusDiscoveryYear) {
        this.virusName = virusName;
        this.symptoms = symptoms;
        this.bodySample = bodySample;
        this.virusDiameter = virusDiameter;
        this.bodySystemEffect = bodySystemEffect;
        this.virusDiscoveredBy = virusDiscoveredBy;
        this.virusDiscoveryYear = virusDiscoveryYear;
        this.virus = new Virus();
        virus.setVirusName(virusName);
        virus.setSymptoms(symptoms);
        virus.setBodySample(bodySample);
        virus.setVirusDiameter(virusDiameter);
        virus.setBodySystemEffect(bodySystemEffect);
        virus.setVirusDiscoveredBy(virusDiscoveredBy);
        virus.setVirusDiscoveryYear(virusDiscoveryYear);
        VirusAbstractClass.viruses.add(counter, virus);
        counter++;
    }

    public static void setViruses(ArrayList<Virus> viruses) {
        VirusAbstractClass.viruses = viruses;
    }

    public ArrayList<Virus> getViruses() {
        return viruses;
    }

    abstract boolean search4Virus(String virusName);

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

    public String getVirusDiameter() {
        return virusDiameter;
    }

    public void setVirusDiameter(String virusDiameter) {
        this.virusDiameter = virusDiameter;
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

    public String getVirusDiscoveryYear() {
        return virusDiscoveryYear;
    }

    public void setVirusDiscoveryYear(String virusDiscoveryYear) {
        this.virusDiscoveryYear = virusDiscoveryYear;
    }
}
