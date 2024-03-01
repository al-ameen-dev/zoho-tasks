package string1;

public class WithoutX2 {
    public static String withoutX2(String str) {
        if (str.length() > 2) {
            if (str.substring(0, 1).equals("x") && str.substring(1, 2).equals("x")) {
                return str.substring(2, str.length());
            } else if (!str.substring(0, 1).equals("x") && str.substring(1, 2).equals("x")) {
                return str.substring(0, 1) + str.substring(2, str.length());
            } else if (str.substring(0, 1).equals("x") && !str.substring(1, 2).equals("x")) {
                return str.substring(1, str.length());
            } else
                return str;
        } else if (str.length() == 1 || str.length() == 0) {
            return "";
        } else {
            if (str.substring(0, 1).equals("x") && str.substring(1, 2).equals("x"))
                return "";
            else
                return str;
        }

    }

}
