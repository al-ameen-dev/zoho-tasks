package string1;

public class MiddleThree {
    public static String middleThree(String str) {
        if (str.length() > 3) {
            int index = (str.length() / 2) - 1;
            return str.substring(index, index + 3);
        }
        return str;
    }

}
