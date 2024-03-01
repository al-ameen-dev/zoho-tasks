package string1;

public class LastTwo {
    public static String lastTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, str.length() - 2) + str.substring(str.length() - 1, str.length())
                    + str.substring(str.length() - 2, str.length() - 1);
        } else {
            if (str.length() < 1) {
                return "";
            } else if (str.length() == 1)
                return str;

            return str.substring(str.length() - 1, str.length()) + str.substring(0, 1);
        }
    }

}
