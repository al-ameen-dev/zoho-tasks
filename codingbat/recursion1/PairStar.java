package recursion1;

public class PairStar {
    public static String pairStar(String str) {
        if (str.length() == 0)
            return "";
        if (str.length() == 1)
            return str;

        if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2))
            return pairStar(str.substring(0, str.length() - 1)) + "*" + str.charAt(str.length() - 1);

        return pairStar(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
    }

}
