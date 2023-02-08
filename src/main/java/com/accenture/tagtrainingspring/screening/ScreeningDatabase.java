package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ScreeningDatabase  {
//    List<Patient> patientList = new ArrayList<Patient>();
//    List <Screening> screeningList = new ArrayList<Screening>();

//    public ScreeningDatabase(List<Patient> patientList, List<Screening> screeningList) {
//        this.patientList = patientList;
//        this.screeningList = screeningList;
//    }

    public List<Patient> getPatientList() {
        Patient p = new Patient("Joe","01/01/1960","Male",1);
        Patient p1 = new Patient("Steve","01/01/1960","Male",2);
        Patient p2 = new Patient("Jody","01/01/1960","Female",3);
        List<Patient> listPatient = new ArrayList<Patient>();
        listPatient.add(p);
        listPatient.add(p1);
        listPatient.add(p2);
        return listPatient;
    }

//    public void setPatientList(List<Patient> patientList) {
//        this.patientList = patientList;
//    }

    public List<Screening> getScreeningList() {
        List<Patient> listPatient = getPatientList();
        Screening s = new Screening(1,listPatient.get(0),"27/03/2023",true);
        Screening s1 = new Screening(2,listPatient.get(1),"N/A",false);
        Screening s2 = new Screening(3,listPatient.get(2),"01/04/23",true);
        List<Screening> listScreening = new ArrayList<Screening>();
        listScreening.add(s);
        listScreening.add(s1);
        listScreening.add(s2);
        return listScreening;
    }

//    public void setScreeningList(List<Screening> screeningList) {
//        this.screeningList = screeningList;
//    }
}
