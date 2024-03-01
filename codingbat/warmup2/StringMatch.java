package warmup2;

public class StringMatch {
    public static int stringMatch(String a, String b) {
        int count = 0;
        int len = (a.length() < b.length()) ? a.length() : b.length();
        for (int i = 0; i < len - 1; i++) {
            if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
