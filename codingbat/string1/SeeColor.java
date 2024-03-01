package string1;

public class SeeColor {
    public static String seeColor(String str) {
        if (str.startsWith("red"))
            return "red";
        else if (str.startsWith("blue"))
            return "blue";
        else
            return "";
    }
}
