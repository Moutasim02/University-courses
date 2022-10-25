package com.data_structures_and_algorithms_CSC301.Labs.Lab8;

import java.util.ArrayList;

public class MedicalRecord {
    private String Diagnosis, CurrentMedication;
	private ArrayList<Patient> patients = new ArrayList<>();
	public MedicalRecord() {
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "\nMedicalRecord{" +
				"Diagnosis='" + Diagnosis + '\'' +
				", CurrentMedication='" + CurrentMedication + '\'' +
				", patients=" + patients +
				"}";
	}

	public MedicalRecord(String diagnosis, String currentMedication) {
		Diagnosis = diagnosis;
		CurrentMedication = currentMedication;
	}

	public String getDiagnosis() {
		return Diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		Diagnosis = diagnosis;
	}

	public String getCurrentMedication() {
		return CurrentMedication;
	}

	public void setCurrentMedication(String currentMedication) {
		CurrentMedication = currentMedication;
	}

}
