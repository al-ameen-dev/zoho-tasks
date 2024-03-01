package logic1;

public class MaxMod5 {
    public static int maxMod5(int a, int b) {
        if (a > b) {
            if (a % 5 == b % 5)
                return b;
            else
                return a;
        } else if (a == b) {
            return 0;
        } else {
            if (a % 5 == b % 5)
                return a;
            else
                return b;
        }
    }

}
