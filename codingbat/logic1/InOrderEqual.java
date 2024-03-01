package logic1;

public class InOrderEqual {
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if ((c > b && b > a) || ((c >= b && b >= a) && equalOk)) {
            return true;
        } else
            return false;
    }

}
