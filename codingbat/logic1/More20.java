package logic1;

public class More20 {
    public static boolean more20(int n) {
        int rem = n % 20;
        if (rem == 1 || rem == 2)
            return true;
        else
            return false;
    }

}
