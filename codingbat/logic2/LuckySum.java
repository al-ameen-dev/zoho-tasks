package logic2;

public class LuckySum {
    public static int luckySum(int a, int b, int c) {
        if ((a != 13 && b != 13 && c != 13))
            return a + b + c;
        else if ((a != 13 && b != 13 && c == 13))
            return a + b;
        else if (a == 13)
            return 0;
        else
            return a;
    }

}
