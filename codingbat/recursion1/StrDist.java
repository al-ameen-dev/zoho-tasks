package recursion1;

public class StrDist {
    public static int strDist(String str, String sub) {

        if (str.length() < sub.length())
            return 0;

        if (str.length() == 1 && !str.equals(sub))
            return 0;

        if (str.substring(0, sub.length()).equals(sub) &&
                str.substring(Math.abs(sub.length() - str.length()), str.length()).equals(sub)) {
            return str.length();
        } else if (str.substring(0, sub.length()).equals(sub) &&
                !str.substring(Math.abs(sub.length() - str.length()), str.length()).equals(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        } else if (!str.substring(0, sub.length()).equals(sub) &&
                str.substring(Math.abs(sub.length() - str.length()), str.length()).equals(sub)) {
            return strDist(str.substring(1, str.length()), sub);
        }
        return strDist(str.substring(1, str.length() - 1), sub);
    }

}
