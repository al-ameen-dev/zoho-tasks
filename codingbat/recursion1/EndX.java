package recursion1;

public class EndX {
    public static String endX(String str) {

        if (str.length() == 0)
            return "";

        if (str.length() == 1)
            return str;

        if (str.charAt(0) == 'x')
            return endX(str.substring(1, str.length())) + "x";

        return str.charAt(0) + endX(str.substring(1, str.length()));
    }

}
