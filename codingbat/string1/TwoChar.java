package string1;

public class TwoChar {
    public static String twoChar(String str, int index) {
        if (index >= str.length() - 1 || index < 0)
            return str.substring(0, 2);
        return str.substring(index, index + 2);
    }

}
