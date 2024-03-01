package logic2;

public class NoTeenSum {
    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if ((n > 12 && n < 15) || (n > 16 && n < 20))
            return 0;
        else if (n > 14 && n < 17)
            return n;
        else
            return n;
    }
}
