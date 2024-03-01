package logic2;

public class LoneSum {
    public static int loneSum(int a, int b, int c) {
        if ((a != b && a != c) && b != c)
            return a + b + c;
        else if ((a != b && a == c))
            return b;
        else if ((b != c && b == a))
            return c;
        else if (a == b && a == c)
            return 0;
        else
            return a;
    }

}
