package logic1;

public class WithoutDoubles {
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if ((die1 == die2) && noDoubles) {
            if (die1 == 6) {
                die1 = 1;
                return die1 + die2;
            } else if (die2 == 6) {
                die2 = 1;
                return die1 + die2;
            } else
                return die1 + die2 + 1;
        } else if (((die1 != die2) && noDoubles)) {
            return die1 + die2;
        } else {
            return die1 + die2;
        }
    }

}
