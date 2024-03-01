package logic1;

public class TwoAsOne {
    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || b + c == a || a + c == b)
            return true;
        else
            return false;
    }

}
