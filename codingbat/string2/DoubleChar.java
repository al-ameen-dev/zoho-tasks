package string2;

public class DoubleChar {
    public static String doubleChar(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            String sub = str.substring(i, i + 1);
            s += sub + sub;
        }
        return s;
    }

}
