package course.fundamentals;

public class Ternary {
    static boolean isTurnOnLight;

    public static boolean turnOnOffLight() {
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
