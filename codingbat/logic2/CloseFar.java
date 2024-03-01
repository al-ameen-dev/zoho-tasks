package logic2;

public class CloseFar {
    public static boolean closeFar(int a, int b, int c) {
        if ((Math.abs(a - b) == 1 && Math.abs(a - c) != 1) && Math.abs(b - c) != 1)
            return true;
        else if (Math.abs(b - a) == 1 && Math.abs(b - c) != 1 && Math.abs(a - c) != 1)
            return true;
        else if (Math.abs(c - a) == 1 && Math.abs(c - b) != 1 && Math.abs(a - b) != 1)
            return true;
        else if ((a == b && b != c) || (a == c && b != c) || (a == c && b != c))
            return true;
        else
            return false;
    }

}
