package warmup1;

public class MissingChar {
    public static String missingChar(String str, int n) {
        int index = 0;
        char[] charr = new char[str.length() - 1];
        for (int i = 0; i < str.length(); i++) {
            if (i != n) {
                charr[index++] = str.charAt(i);
            }
        }
        return String.valueOf(charr);
    }

}
