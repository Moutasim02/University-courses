package com.programming_II_CSC202.Project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String convertedPath = "/home/moutasim/IdeaProjects/University-courses/src/com/programming_II_CSC202/Project/";
        try {
            File medicalRecords = new File(convertedPath + "medicalRecords.txt");
            BufferedWriter convertedMedicalRecords = new BufferedWriter(new FileWriter(convertedPath + "convertedMedicalRecords.txt"));
            Scanner input = new Scanner(medicalRecords);
            ArrayList<MedicalMapper> arrayList = new ArrayList<>();
            MedicalMapper objectToMap = null;

            do {
                objectToMap = new MedicalMapper();
                arrayList.add(objectToMap);

                objectToMap.setPid(input.nextInt());
                objectToMap.setAge(input.nextInt());
                objectToMap.setGender(input.nextInt());
                objectToMap.setWeight(input.nextDouble());
                objectToMap.setHeight(input.nextDouble());
                objectToMap.setSbp(input.nextInt());
                objectToMap.setDbp(input.nextInt());
                objectToMap.setFbs(input.nextDouble());
                objectToMap.setChol(input.nextDouble());
                objectToMap.setLdl(input.nextDouble());
                objectToMap.setHdl(input.nextDouble());
                objectToMap.setTg(input.nextDouble());
                objectToMap.setHba1c(input.nextDouble());

            } while (input.hasNextLine());

            Collections.sort(arrayList);
            for (MedicalMapper obj : arrayList) {
                convertedMedicalRecords.write(obj + "\n");
            }

            input.close();
            convertedMedicalRecords.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Successfully Generated All The Records, Enter by pressing -> " + convertedPath + "convertedMedicalRecords.txt");
    }
}

