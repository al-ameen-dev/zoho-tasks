package string2;

public class XYBalance {
    public static boolean xyBalance(String str) {
        int len = str.length();
        int yindex = (str.contains("y") ? str.lastIndexOf("y") : 0);

        if (yindex == len - 1 && str.substring(0, len - 1).contains("x"))
            return true;
        else if (str.substring(yindex, len).contains("x"))
            return false;
        else
            return true;
    }

}
