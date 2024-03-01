package logic2;

public class EvenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {

        if (a == b && b == c)
            return true;
        if (a == b || b == c)
            return false;

        if (Math.abs(a - b) == Math.abs(b - c) || Math.abs(b - a) == Math.abs(a - c) ||
                Math.abs(c - a) == Math.abs(a - b) || Math.abs(b - c) == Math.abs(c - a))
            return true;
        else
            return false;
    }

}
