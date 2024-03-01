package warmup2;

public class FrontTimes {
    public static String frontTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                sb.append(str);
            }
            return sb.toString();
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    sb.append(str.charAt(j));
                }
            }
            return sb.toString();
        }
    }

}
