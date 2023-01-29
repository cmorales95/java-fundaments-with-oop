package course.poo.exercise.ui;

import course.poo.exercise.model.Doctor;
import course.poo.exercise.model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1 -> {
                    System.out.println("Doctor");
                    authUser(1);
                }
                case 2 -> {
                    response = 0;
                    authUser(2);
                }
                case 0 -> {
                    System.out.println("Thank you for you visit");
                    return;
                }
                default -> System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType) {
        // userType = 1
        // userType = 2 Patient
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("aleja", "aleja@email.com", "generalist"));
        doctors.add(new Doctor("daniela", "daniela@email.com", "generalist"));
        doctors.add(new Doctor("jennifer", "jennifer@email.com", "generalist"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Cristian", "cristian@email.com"));
        patients.add(new Patient("Faver", "faver@email.com"));
        patients.add(new Patient("Sebastian", "sebastian@email.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if (userType == 2) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }


        } while (!emailCorrect);
    }
}