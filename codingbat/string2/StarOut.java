package string2;

public class StarOut {
    public static String starOut(String str) {
        int len = str.length();
        String res = "";
        if (len == 0)
            return "";
        if (len == 1 && !str.equals("*"))
            return str;

        if (str.charAt(0) != '*' && str.charAt(1) != '*')
            res += str.charAt(0);

        for (int i = 1; i < len - 1; i++) {
            if (str.charAt(i - 1) != '*' && str.charAt(i) != '*' && str.charAt(i + 1) != '*') {
                res += str.charAt(i);
            }
        }
        if (str.charAt(len - 1) != '*' && str.charAt(len - 2) != '*') {
            res += str.charAt(len - 1);
        }
        return res;
    }

}
