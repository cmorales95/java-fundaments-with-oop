package course.poo.exercise.utils;
public enum WeekDays {
    MONDAY("Lunes"),
    TUESDAY("Martes"),
    WEDNESDAY("Miercoles"),
    THUSDAY("Jueves"),
    FRIDAY("Viernes"),
    SATURDAY("Sábado"),
    SUNDAY("Doming");


    private String spanish;

    private WeekDays(String s) {
        spanish = s;
    }

    public String getSpanish() {
        return spanish;
    }
}
