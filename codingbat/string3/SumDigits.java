package string3;

public class SumDigits {
    public static int sumDigits(String str) {
        int sum = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return sum;
    }

}
