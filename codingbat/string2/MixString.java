package string2;

public class MixString {
    public static String mixString(String a, String b) {
        int len = Math.min(a.length(), b.length());
        String str = "";
        for (int i = 0; i < len; i++) {
            str += a.charAt(i) + "" + b.charAt(i);
        }
        str += (a.length() > b.length() ? a.substring(len, a.length()) : b.substring(len, b.length()));

        return str;
    }

}
