package string2;

public class PrefixAgain {
    public static boolean prefixAgain(String str, int n) {
        int len = str.length();
        String prefix = str.substring(0, n);
        if (str.substring(prefix.length(), len).contains(prefix))
            return true;
        return false;
    }

}
