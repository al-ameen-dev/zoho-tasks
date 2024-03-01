package string3;

public class SumNumbers {
    public static int sumNumbers(String str) {
        int len = str.length();
        String digit = "";
        int sum = 0;
        if (len == 0)
            return 0;
        if (len == 1 && Character.isDigit(str.charAt(0))) {
            return Integer.parseInt(str);
        }
        if (Character.isDigit(str.charAt(len - 1)) && (!Character.isDigit(str.charAt(len - 2)) ||
                Character.isWhitespace(str.charAt(len - 2)))) {
            sum += Integer.parseInt(str.substring(len - 1, len));
        }

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (!(Character.isDigit(str.charAt(i))) || Character.isWhitespace(str.charAt(i))) {
                    break;
                }
                if (Character.isDigit(str.charAt(i)) && (!Character.isDigit(str.charAt(j)) ||
                        Character.isWhitespace(str.charAt(j)))) {
                    digit += str.substring(i, j);
                    i += str.substring(i, j).length();
                    break;
                } else if (Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(j)) &&
                        j == len - 1) {
                    digit += str.substring(i, j + 1);
                    break;
                }
            }
            if (digit.length() != 0) {
                sum += Integer.parseInt(digit);
                digit = "";
            }

        }
        return sum;
    }

}
