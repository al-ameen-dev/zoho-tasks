package recursion1;

public class SumDigits {
    public static int sumDigits(int n) {

        if (n <= 9)
            return n;

        return sumDigits(n / 10) + sumDigits(n % 10);
    }

}
