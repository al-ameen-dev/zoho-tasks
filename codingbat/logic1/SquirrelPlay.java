package logic1;

public class SquirrelPlay {
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if ((temp > 59 && temp < 101) && isSummer) {
            return true;
        } else if (temp > 59 && temp < 91) {
            return true;
        } else {
            return false;
        }
    }

}
