package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

import java.util.ArrayList;

public abstract class VirusAbstractClass {
    private static ResearchLab lab;
    private static int counter;
    private static ArrayList<Virus> viruses = new ArrayList<>();
    private String virusName;
    private String symptoms;
    private String bodySample;
    private String bodySystemEffect;
    private String virusDiscoveredBy;
    private int virusDiscoveryYear;

    public VirusAbstractClass() {
    }

    public VirusAbstractClass (int labIndex, String virusName, String symptoms, String bodySample, String bodySystemEffect, String virusDiscoveredBy, int virusDiscoveryYear) {
        this.virusName = virusName;
        this.symptoms = symptoms;
        this.bodySample = bodySample;
        this.bodySystemEffect = bodySystemEffect;
        this.virusDiscoveredBy = virusDiscoveredBy;
        this.virusDiscoveryYear = virusDiscoveryYear;
        Virus virus = new Virus();
        virus.setVirusName(virusName);
        virus.setSymptoms(symptoms);
        virus.setBodySample(bodySample);
        virus.setBodySystemEffect(bodySystemEffect);
        virus.setVirusDiscoveredBy(virusDiscoveredBy);
        virus.setVirusDiscoveryYear(virusDiscoveryYear);
        VirusAbstractClass.viruses.add(counter, virus);
        addVirusToRL(VirusAbstractClass.viruses.get(counter));
        counter++;
    }

    @Override
    public String toString() {
        return "VirusAbstractClass{" +
                "Lab: " + Virus.getLab() +
                ", virusName='" + virusName + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", bodySample='" + bodySample + '\'' +
                ", bodySystemEffect='" + bodySystemEffect + '\'' +
                ", virusDiscoveredBy='" + virusDiscoveredBy + '\'' +
                ", virusDiscoveryYear=" + virusDiscoveryYear +
                '}';
    }

    private void addVirusToRL(Virus virus) {

    }

    abstract boolean search4Virus(String virusName);

    public static ResearchLab getLab() {
        return lab;
    }

    public static void setLab(ResearchLab lab) {
        VirusAbstractClass.lab = lab;
    }

    public static void setViruses(ArrayList<Virus> viruses) {
        VirusAbstractClass.viruses = viruses;
    }

    public static ArrayList<Virus> getViruses() {
        return viruses;
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
