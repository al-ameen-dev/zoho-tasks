package warmup1;

public class In1020 {
    public static boolean in1020(int a, int b) {
        if ((a > 9 && a < 21) && (b > 9 && b < 21))
            return true;
        else if ((a < 10 && a > 20) && (b < 10 && b > 20))
            return false;
        else if ((a < 10 || a > 20) && (b > 9 && b < 21))
            return true;
        else if ((a > 9 && a < 21) && (b < 10 || b > 20))
            return true;
        else
            return false;
    }

}
