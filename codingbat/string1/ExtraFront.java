package string1;

public class ExtraFront {
    public static String extraFront(String str) {
        if (str.length() < 2)
            return str + str + str;
        else {
            String r = str.substring(0, 2);
            return r + r + r;
        }
    }
}
