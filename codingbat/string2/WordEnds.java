package string2;

public class WordEnds {
    public static String wordEnds(String str, String word) {
        int len = str.length();
        int wlen = word.length();
        String res = "";

        if ((len == 0 || (len == wlen && str.equals(word))))
            return "";

        for (int i = 0; i < len; i++) {
            if (i <= len - wlen && str.substring(i, i + wlen).equals(word)) {
                if (i == 0)
                    res += str.charAt(i + wlen);
                else if (i + wlen < len)
                    res += str.charAt(i - 1) + "" + str.charAt(i + wlen);
                else
                    res += str.charAt(i - 1);
            }
        }
        return res;
    }

}
