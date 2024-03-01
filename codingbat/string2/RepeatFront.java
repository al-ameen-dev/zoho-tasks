package string2;

public class RepeatFront {
    public static String repeatFront(String str, int n) {
        String res = "";
        for (int i = 0; i <= n; i++) {
            res += str.substring(0, n - i);
        }
        return res;
    }

}
