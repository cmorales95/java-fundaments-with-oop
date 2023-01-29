package course.poo.exercise;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Cristian Morales", "Generalist");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }
    }
}
