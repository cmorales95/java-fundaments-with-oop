package course.poo.exercise;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private static int id = 0; //Autoincrement
    private String name;
    private String speciality;



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

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
