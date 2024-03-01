package logic1;

public class InOrder {
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if ((b > a && c > b) || (!(b > a) && c > b) && bOk)
            return true;
        else
            return false;
    }

}
