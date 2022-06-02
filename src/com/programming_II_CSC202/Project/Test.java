package com.programming_II_CSC202.Project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        MedicalMapper medicalMapper = new MedicalMapper();
        String filePath = "/home/moutasim/IdeaProjects/University-courses/src/com/programming_II_CSC202/Project/medicalRecords.txt";

        try { // Methodology: Store in string, split on spaces, covert to int or double,
            // add to the variables directly from the Arraylist.
            Scanner input = new Scanner(new File(filePath));
            FileWriter converted = new FileWriter("convertedMedicalRecords.txt");


            while (input.hasNext()) {
                if (input.hasNextInt()) {
                    stringArrayList.add(String.valueOf(input.nextInt()));
                } else if (input.hasNextDouble()) {
                    stringArrayList.add(String.valueOf(input.nextDouble()));
                } else {
                    input.next();
                }
            }
//            System.out.println(stringArrayList);
//            System.out.println(Integer.parseInt(stringArrayList.get(0)));


            for (int i = 0; i < stringArrayList.size(); i++) {
//                patient.setAge(Integer.parseInt(stringArrayList.get(i)));
//                i++;
//                medicalMapper.convertGender(patient.getAge());
//
//                patient.setWeight(Double.parseDouble(stringArrayList.get(i)));
//                i++;
//                patient.setHeight(Double.parseDouble(stringArrayList.get(i)));
//                i++;
//                medicalMapper.mapBMI(patient.getBMI());

//                medicalMapper.setSbp(Integer.parseInt(stringArrayList.get(i)));
//                i++;
//                medicalMapper.setDbp(Integer.parseInt(stringArrayList.get(i)));
//                i++;
//                medicalMapper.mapBloodPressure();
//                System.out.println(stringArrayList.get(i));
                medicalMapper.mapFBS(Double.parseDouble(stringArrayList.get(i)));
//
//                System.out.println(medicalMapper);
//                medicalMapper.mapCholesterol(Double.parseDouble(stringArrayList.get(i)));
//                i++;
//                medicalMapper.mapLDL(Double.parseDouble(stringArrayList.get(i)));
//                i++;
//                medicalMapper.mapHDL(Double.parseDouble(stringArrayList.get(i)));
//                i++;
//                medicalMapper.getTG(Double.parseDouble(stringArrayList.get(i)));
//                i++;
//                medicalMapper.mapHB1AC(Double.parseDouble(stringArrayList.get(i)));
//                i++;
            }

            System.out.println(medicalMapper.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileRead(ArrayList<Patient> patients) {

    }
}
