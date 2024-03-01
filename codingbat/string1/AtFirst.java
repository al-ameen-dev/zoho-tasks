package string1;

public class AtFirst {
    public static String atFirst(String str) {
        if (str.length() < 2) {
            if (str.length() < 1)
                return "@@";
            return str + "@";
        } else {
            return str.substring(0, 2);
        }
    }
}
