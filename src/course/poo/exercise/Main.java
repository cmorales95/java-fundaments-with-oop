package course.poo.exercise;

import course.poo.exercise.model.Doctor;
import course.poo.exercise.model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Cristian Morales", "email@email.com","Generalist");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        Patient patient = new Patient("Alejandra", "aleja@gmail.com");

    }
}
