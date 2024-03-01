package string2;

public class ZipZap {
    public static String zipZap(String str) {
        String res = "";
        int len = str.length();
        if (len < 3)
            return str;
        for (int i = 0; i < len;) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                res += str.charAt(i) + "" + str.charAt(i + 2);
                i += 3;
            } else {
                res += str.charAt(i);
                i += 1;
            }
        }
        return res;
    }

}
