package string3;

public class MirrorEnds {
    public static String mirrorEnds(String string) {
        int len = string.length();
        String res = "";

        if (len == 0)
            return "";

        int i = 1, j = len - 1;

        while (i <= len && j >= 0) {
            if (string.substring(0, i).equals(reverse(string.substring(j, len)))) {
                res = string.substring(0, i);
                i++;
                j--;
            } else {
                i++;
                j--;
            }
        }
        return res;

    }

    public static String reverse(String str) {
        String res = "";
        int len = str.length();
        if (len == 0)
            return "";
        for (int i = len - 1; i >= 0; i--)
            res += str.charAt(i);

        return res;
    }
}
