package string1;

public class WithoutX {
    public static String withoutX(String str) {

        if (str.length() > 2) {
            if (str.substring(0, 1).equals("x") && str.substring(str.length() - 1, str.length()).equals("x")) {
                return str.substring(1, str.length() - 1);
            } else if (str.substring(0, 1).equals("x") && !str.substring(str.length() - 1, str.length()).equals("x")) {
                return str.substring(1, str.length());
            } else if (!str.substring(0, 1).equals("x") && str.substring(str.length() - 1, str.length()).equals("x")) {
                return str.substring(0, str.length() - 1);
            } else {
                return str;
            }
        } else if (str.length() == 0)
            return "";
        else if (str.substring(0, 1).equals("x") && str.substring(str.length() - 1, str.length()).equals("x")) {
            return "";
        } else {
            return str;
        }
    }

}
