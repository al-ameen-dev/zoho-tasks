package logic1;

public class In1To10 {
    public static boolean in1To10(int n, boolean outsideMode) {
        if (((n > 0 && n < 11) && !outsideMode) || ((n <= 1 || n >= 10) && outsideMode))
            return true;
        else
            return false;
    }

}
