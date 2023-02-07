package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import org.h2.engine.Database;

import java.util.List;

public class ScreeningService {
    ScreeningDatabase Database;

    public ScreeningService(ScreeningDatabase database) {
        Database = database;
    }

    public boolean appointmentValidator(Patient Patient, Screening Screening){
        boolean appointment;
        if(Patient.getPatientName().equals(Screening.getPatient().getPatientName()) && !Screening.getDateOfScreening().equalsIgnoreCase("N/A")){
            appointment = true;
        }
        else{
            appointment = false;
        }
        return appointment;
    }

    public String getScreenings(ScreeningDatabase database){
        String message = "";
        for (int i = 0; i < database.getScreeningList().size(); i++){
            String messageAdd = database.getScreeningList().get(i).toString();
            String messageAdd2 = messageAdd + database.getScreeningList().get(i+1).toString();
            message = messageAdd + messageAdd2;
        }
        return message;
    }
}
