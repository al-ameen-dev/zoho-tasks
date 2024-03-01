package logic1;

public class GreenTicket {
    public static int greenTicket(int a, int b, int c) {
        if ((a == b && b == c && c == a)) {
            return 20;
        } else if ((a == b && a != c) || (c == b && c != a) || (c == a && c != b)) {
            return 10;
        } else
            return 0;
    }

}
