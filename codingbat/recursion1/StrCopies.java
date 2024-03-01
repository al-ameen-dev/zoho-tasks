package recursion1;

public class StrCopies {
    public static boolean strCopies(String str, String sub, int n) {

        if (str.length() < sub.length() && n != 0)
            return false;
        if (n == 0)
            return true;

        if (str.substring(0, sub.length()).equals(sub)) {
            n = n - 1;
            return strCopies(str.substring(1, str.length()), sub, n);
        }

        return strCopies(str.substring(1, str.length()), sub, n);
    }

}
