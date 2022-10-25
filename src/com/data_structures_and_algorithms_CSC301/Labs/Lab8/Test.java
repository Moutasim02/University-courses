package com.data_structures_and_algorithms_CSC301.Labs.Lab8;

/**
 * @author Moutasim El Ayoubi
 * student ID: 1080415
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("\n----------- Challenging Task: Redesign the system properly .-----------");

        Hospital hospital1 =
                new Hospital("Mediclinic Hospital", "Abu Dhabi", 3);
        Hospital hospital2 =
                new Hospital("Phoenix Hospital", "Dubai", 1);
        Hospital hospital3 =
                new Hospital("NMC Hospital", "Abu Dhabi", 3);

        for (int i = 0; i < 6; i++) {
            hospital1.getMedicalRecords().add(i, new MedicalRecord("Headache", "Paracetamol"));
            hospital2.getMedicalRecords().add(i, new MedicalRecord("Headache", "Paracetamol"));
            hospital3.getMedicalRecords().add(i, new MedicalRecord("Headache", "Paracetamol"));
        }

        hospital1.getMedicalRecords().get(4).getPatients().add(new Patient(234562, "Khaled", 25));
        hospital1.getMedicalRecords().get(2).getPatients().add(new Patient(324556, "Adam", 19));
        hospital1.getMedicalRecords().get(1).getPatients().add(new Patient(1080415, "Moutasim", 20));
        hospital1.getMedicalRecords().get(0).getPatients().add(new Patient(342544, "Hamad", 24));
        hospital1.getMedicalRecords().get(3).getPatients().add(new Patient(234513, "Ahmad", 26));

        hospital2.getMedicalRecords().get(4).getPatients().add(new Patient(234562, "Khaled", 25));
        hospital2.getMedicalRecords().get(2).getPatients().add(new Patient(324556, "Adam", 19));
        hospital2.getMedicalRecords().get(1).getPatients().add(new Patient(1080415, "Moutasim", 20));
        hospital2.getMedicalRecords().get(0).getPatients().add(new Patient(342544, "Hamad", 24));
        hospital2.getMedicalRecords().get(3).getPatients().add(new Patient(234513, "Ahmad", 26));

        hospital3.getMedicalRecords().get(4).getPatients().add(new Patient(234562, "Khaled", 25));
        hospital3.getMedicalRecords().get(2).getPatients().add(new Patient(324556, "Adam", 19));
        hospital3.getMedicalRecords().get(1).getPatients().add(new Patient(1080415, "Moutasim", 20));
        hospital3.getMedicalRecords().get(0).getPatients().add(new Patient(342544, "Hamad", 24));
        hospital3.getMedicalRecords().get(3).getPatients().add(new Patient(234513, "Ahmad", 26));

        System.out.print("""
                -------------------------------
                          Hospital 1
                -------------------------------
                """);
        System.out.println(hospital1);

        System.out.print("""
              -------------------------------
                          Hospital 2
              -------------------------------
                """);
        System.out.println(hospital2);

        System.out.print("""
                -------------------------------
                          Hospital 3
                -------------------------------
                """);
        System.out.println(hospital3);

    }
}