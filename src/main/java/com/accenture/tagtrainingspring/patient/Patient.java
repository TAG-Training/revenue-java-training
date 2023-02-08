package com.accenture.tagtrainingspring.patient;

import org.springframework.stereotype.Component;

@Component

public class Patient {
    String patientName, DOB, patientGender;
    int patientID;

    public Patient(String patientName, String DOB, String patientGender, int patientID) {
        this.patientName = patientName;
        this.DOB = DOB;
        this.patientGender = patientGender;
        this.patientID = patientID;
    }

    public Patient() {
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
}
