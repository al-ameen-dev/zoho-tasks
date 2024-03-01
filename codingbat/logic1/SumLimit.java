package logic1;

public class SumLimit {
    public static int sumLimit(int a, int b) {
        String sum = String.valueOf((a + b));
        if (sum.length() == String.valueOf(a).length()) {
            return Integer.parseInt(sum);
        } else {
            return a;
        }
    }

}
