package string3;

public class SameEnds {
    public static String sameEnds(String string) {

        int len = string.length();
        if (len == 0 || len == 1)
            return "";

        int i = 1, j = len - 1;
        String str = "";
        while (i <= j) {
            if (string.substring(0, i).equals(string.substring(j, len))) {
                str = string.substring(0, i);
                i++;
                j--;
            } else {
                i++;
                j--;
            }
        }
        return str;
    }

}
