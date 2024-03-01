package logic1;

public class TeenSum {
    public static int teenSum(int a, int b) {
        if ((a > 12 && a < 20) || (b > 12 && b < 20))
            return 19;
        else
            return a + b;
    }

}
