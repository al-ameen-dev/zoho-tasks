package logic1;

public class RedTicket {
    public static int redTicket(int a, int b, int c) {
        if (b != a && c != a) {
            return 1;
        } else if ((a == b && b == c) && (a != 2)) {
            return 5;
        } else if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else
            return 0;
    }

}
