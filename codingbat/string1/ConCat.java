package string1;

public class ConCat {
    public static String conCat(String a, String b) {
        if (a.length() < 1) {
            return b;
        } else if (b.length() < 1) {
            return a;
        }
        if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))) {
            return a.substring(0, a.length() - 1) + b;
        }
        return a + b;
    }
}
