package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ScreeningDatabase  {
    @Component
    List<Patient> patientList = new ArrayList<Patient>();
    List <Screening> screeningList = new ArrayList<Screening>();

    public ScreeningDatabase(List<Patient> patientList, List<Screening> screeningList) {
        this.patientList = patientList;
        this.screeningList = screeningList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public List<Screening> getScreeningList() {
        return screeningList;
    }

    public void setScreeningList(List<Screening> screeningList) {
        this.screeningList = screeningList;
    }
}
