package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.stereotype.Component;

@Component

public class Screening {
    int ScreeningID;
    Patient patient;
    String DateOfScreening;
    Boolean result;

    public Screening(int screeningID, Patient patient, String dateOfScreening, Boolean result) {
        ScreeningID = screeningID;
        this.patient = patient;
        DateOfScreening = dateOfScreening;
        this.result = result;
    }

    public Screening() {

    }

    public int getScreeningID() {
        return ScreeningID;
    }

    public void setScreeningID(int screeningID) {
        ScreeningID = screeningID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDateOfScreening() {
        return DateOfScreening;
    }

    public void setDateOfScreening(String dateOfScreening) {
        DateOfScreening = dateOfScreening;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }
}
