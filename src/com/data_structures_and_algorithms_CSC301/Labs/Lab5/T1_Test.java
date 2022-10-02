package com.data_structures_and_algorithms_CSC301.Labs.Lab5;

import java.util.*;

public class T1_Test {
        public static void main(String[] args){
            ArrayList<T1_Patient> allPatients = new ArrayList<>();
            allPatients.add(new T1_Patient(101, "Zayed", 23));
            allPatients.add(new T1_Patient(106, "Abdulla", 27));
            allPatients.add(new T1_Patient(105, "Muhammed", 21));
            allPatients.add(new T1_Patient(104, "Ali", 25));
            allPatients.add(new T1_Patient(102, "Sara", 22));


            // Call the sort method from Collections
            Collections.sort(allPatients);
            // Display sorted patients
            for (T1_Patient pt : allPatients) {
                System.out.println(pt.patientID + " " + pt.name + " " + pt.age);
            }

            Iterator<T1_Patient> iterator = allPatients.iterator();
            while (iterator.hasNext()) {
                // Use the remove method in the iterator to remove an element from the list
                // Now remove the patient Sara from the list
                if (iterator.next().name.equals("Sara")) {
                    iterator.remove();
                }
            }
            System.out.println(allPatients);

        }
    }
