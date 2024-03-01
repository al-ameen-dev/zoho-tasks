package logic1;

public class SortaSum {
    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum > 9 && sum < 20)
            return 20;
        else
            return sum;
    }

}
