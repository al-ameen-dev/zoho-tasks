package string2;

public class RepeatEnd {
    public static String repeatEnd(String str, int n) {
        String subs = str.substring(str.length() - n, str.length());
        String res = "";

        for (int i = 0; i < n; i++) {
            res += subs;
        }
        return res;
    }

}
