package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningDatabase;
import com.accenture.tagtrainingspring.screening.ScreeningService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();

		//Instances of Patient & Screening classes
		List <Patient> patientList = new ArrayList<Patient>();
		Patient p = new Patient("Joe","01/01/1960","Male",1);
		Patient p1 = new Patient("Steve","01/01/1960","Male",2);
		Patient p2 = new Patient("Jody","01/01/1960","Female",3);
		patientList.add(p);
		patientList.add(p1);
		patientList.add(p2);

		List <Screening> screeningList = new ArrayList<Screening>();
		Screening s = new Screening(1,p,"27/03/2023",true);
		Screening s1 = new Screening(2,p1,"N/A",false);
		Screening s2 = new Screening(3,p2,"01/04/23",true);
		screeningList.add(s);
		screeningList.add(s1);
		screeningList.add(s2);
		ScreeningDatabase screeningDatabase = new ScreeningDatabase(patientList,screeningList);
		ScreeningService ss = new ScreeningService(screeningDatabase);

		for (int i = 0; i < 3; i++) {
			System.out.println("---------------------------\n"+
				"Patient: "+"'"+screeningDatabase.getScreeningList().get(i).getPatient().getPatientName()+"'\n"+
				"ID: "+screeningDatabase.getScreeningList().get(i).getPatient().getPatientID()+"\n"+
				"Malignant Diagnosis: "+ screeningDatabase.getScreeningList().get(i).getResult()+"\n"+
				"Appointment: "+ss.appointmentValidator(screeningDatabase.getScreeningList().get(i).getPatient(),screeningDatabase.getScreeningList().get(i))
			);
		}
	}

	private static void printWelcomeMessage() {
		System.out.println("\n" +
				"  _______       _____   _______        _       _             \n" +
				" |__   __|/\\   / ____| |__   __|      (_)     (_)            \n" +
				"    | |  /  \\ | |  __     | |_ __ __ _ _ _ __  _ _ __   __ _ \n" +
				"    | | / /\\ \\| | |_ |    | | '__/ _` | | '_ \\| | '_ \\ / _` |\n" +
				"    | |/ ____ \\ |__| |    | | | | (_| | | | | | | | | | (_| |\n" +
				"    |_/_/    \\_\\_____|    |_|_|  \\__,_|_|_| |_|_|_| |_|\\__, |\n" +
				"                                                        __/ |\n" +
				"                                                       |___/ \n");
	}

}
