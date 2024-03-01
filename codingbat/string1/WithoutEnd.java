package string1;

public class WithoutEnd {
    public static String withoutEnd(String str) {
        if (str.length() > 2)
            return str.substring(1, str.length() - 1);
        return "";
    }
}
