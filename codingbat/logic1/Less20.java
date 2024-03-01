package logic1;

public class Less20 {
    public static boolean less20(int n) {
        if ((n + 2) % 20 == 0 || (n + 1) % 20 == 0)
            return true;
        else
            return false;
    }

}
