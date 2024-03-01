package string3;

public class WithoutString {
    public static String withoutString(String base, String remove) {
        int len = base.length();
        int rlen = remove.length();

        String str = "";

        int i = 0;
        while (i < len) {
            if (i <= len - rlen && base.substring(i, i + rlen).toLowerCase().equals(remove.toLowerCase())) {
                i += rlen;
            } else {
                str += base.charAt(i);
                i += 1;
            }
        }
        return str;
    }

}
