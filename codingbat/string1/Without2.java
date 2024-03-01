package string1;

public class Without2 {
    public static String without2(String str) {
        if (str.length() > 2) {
            String sub = str.substring(str.length() - 2, str.length());
            if (str.substring(0, 2).equals(sub)) {
                return str.substring(2, str.length());
            } else
                return str;
        } else if (str.length() == 1) {
            return str;
        }
        return "";
    }

}
