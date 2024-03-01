package warmup1;

public class EveryNth {
    public static String everyNth(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}
