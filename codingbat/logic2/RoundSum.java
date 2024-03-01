package logic2;

public class RoundSum {
    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        if (num % 10 >= 5) {
            int diff = Math.abs((num % 10) - 10);
            return num + diff;
        } else {
            int diff = num % 10;
            return num - diff;
        }
    }

}
