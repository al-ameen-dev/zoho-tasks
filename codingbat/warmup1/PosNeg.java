package warmup1;

public class PosNeg {
    public static boolean posNeg(int a, int b, boolean negative) {

        if (negative && a < 0 && b < 0) {
            return true;
        }

        else if ((a < 0 && !(b < 0) && !negative) || (!(a < 0) && b < 0 && !negative)) {
            return true;
        } else {
            return false;
        }
    }

}
