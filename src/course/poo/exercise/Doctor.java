package course.poo.exercise;

import javax.print.Doc;

public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    Doctor() {
        System.out.println("Running executor");
    }

    Doctor(String name, String speciality) {
        System.out.println("the name of the doctor is: " + name);
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    public void showID() {
        System.out.println("ID Doctor" + id);
    }

    // behaviors
    public void showName() {
        System.out.println(name);
    }
}
