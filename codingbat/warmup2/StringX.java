package warmup2;

public class StringX {
    public static String stringX(String str) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'x' && (i == 0 || i == len - 1)) {
                sb.append(str.charAt(i));
            } else if (str.charAt(i) != 'x') {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
