package course.poo.exercise;

public class Main {
    public static void main(String[] args) {
//        UIMenu.showMenu();

        Doctor myDoctor = new Doctor("don Giovanni", "Generalist");
        System.out.println(myDoctor.name);

        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());
    }
}
