package logic1;

public class Old35 {
    public static boolean old35(int n) {
        int rem3 = n % 3;
        int rem5 = n % 5;
        if (rem3 == 0 && rem5 == 0) {
            return false;
        } else if (rem3 == 0 || rem5 == 0)
            return true;
        else
            return false;
    }

}
