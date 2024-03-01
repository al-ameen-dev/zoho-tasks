package warmup2;

public class StringTimes {
    public static String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
