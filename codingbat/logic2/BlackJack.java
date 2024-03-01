package logic2;

public class BlackJack {
    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21 || b == 21)
            return b;
        if (b > 21 || a == 21)
            return a;
        if (a - 21 > b - 21)
            return a;
        else
            return b;
    }

}
