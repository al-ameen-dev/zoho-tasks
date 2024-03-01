package string2;

public class PlusOut {
    public static String plusOut(String str, String word) {
        int len = str.length();
        String res = "";
        for (int i = 0; i < len;) {
            if (i <= len - word.length() && str.substring(i, i + word.length()).equals(word)) {
                res += word;
                i += word.length();
            } else {
                res += "+";
                i++;
            }

        }
        return res;
    }

}
