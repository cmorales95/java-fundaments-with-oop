package course.poo.exercise;

public class Main {
    public static void main(String[] args) {
//        UIMenu.showMenu();

        Doctor myDoctor = new Doctor("don Giovanni", "Generalist");
        System.out.println(myDoctor.name);

        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        Patient patient2 = new Patient("Linda", "gata@gmail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Charlie");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
    }
}
