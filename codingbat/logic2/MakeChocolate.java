package logic2;

public class MakeChocolate {
    public static int makeChocolate(int small, int big, int goal) {
        if (goal > ((big * 5) + small))
            return -1;
        if (goal % 5 > small)
            return -1;
        if (goal % 5 == small)
            return small;
        if (big * 5 < goal)
            return (goal - big * 5);
        else
            return goal % 5;
    }

}
