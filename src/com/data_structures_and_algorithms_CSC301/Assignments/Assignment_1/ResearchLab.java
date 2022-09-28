package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

import java.util.ArrayList;

public class ResearchLab implements ResearchLabInterface {
    private String labCategory;
    private String labLocation;
    private String labSize; // Lab size is string because we want to make the user specify his SI unit.
    ArrayList<Virus> viruses = new ArrayList<>(); // ResearchLab has a Virus

    public ResearchLab() {
    }

    public ResearchLab(String labCategory, String labLocation, String labSize) {
        this.labCategory = labCategory;
        this.labLocation = labLocation;
        this.labSize = labSize;
    }

    @Override
    public void deleteInstancesOfViruses(String userCategory) {
        for (int i = 0; i < VirusMS.researchLabs.size(); i++) {
            if (userCategory.equals(VirusMS.researchLabs.get(i).getLabCategory())) {
                VirusMS.researchLabs.get(i).viruses.clear();
            }
        }
    }

    @Override
    public void search4Virus(String userVirusName) {
        for (int i = 0; i < VirusMS.researchLabs.size(); i++) {
            for (int j = 0; j < VirusMS.researchLabs.get(i).viruses.size(); j++) {
                if (userVirusName.equals(VirusMS.researchLabs.get(i).viruses.get(j).getVirusName())) {
                    System.out.println("Virus found!");
                    return;
                }
            }
        }
        System.out.println("Virus not found!");
    }

    @Override
    public String toString() {
        return "ResearchLab{" +
                "labCategory='" + labCategory + '\'' +
                ", labLocation='" + labLocation + '\'' +
                ", labSize=" + labSize +
                '}';
    }

    public String getLabCategory() {
        return labCategory;
    }

    public void setLabCategory(String labCategory) {
        this.labCategory = labCategory;
    }

    public String getLabLocation() {
        return labLocation;
    }

    public void setLabLocation(String labLocation) {
        this.labLocation = labLocation;
    }

    public String getLabSize() {
        return labSize;
    }

    public void setLabSize(String labSize) {
        this.labSize = labSize;
    }
}
