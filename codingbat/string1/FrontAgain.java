package string1;

public class FrontAgain {
    public static boolean frontAgain(String str) {
        if (str.length() > 1) {
            if (str.endsWith(str.substring(0, 2)))
                return true;
        }
        return false;
    }

}
