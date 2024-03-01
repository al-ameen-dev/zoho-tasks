package string1;

public class DeFront {
    public static String deFront(String str) {
        if (str.length() > 1) {
            if ((str.substring(0, 1).equals("a") && str.substring(1, 2).equals("b"))) {
                return str;
            } else if (str.substring(0, 1).equals("a") && !str.substring(1, 2).equals("b")) {
                return str.substring(0, 1) + str.substring(2, str.length());
            } else if (!str.substring(0, 1).equals("a") && str.substring(1, 2).equals("b")) {
                return str.substring(1, 2) + str.substring(2, str.length());
            } else {
                return str.substring(2, str.length());
            }
        }
        return "";
    }

}
