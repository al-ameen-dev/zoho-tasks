package ap1;

public class DivideSelf {
    public static boolean dividesSelf(int n) {

        int val = n;
        while (n > 0) {
            if (n % 10 == 0)
                return false;
            else if (val % (n % 10) != 0)
                return false;
            n = n / 10;
        }
        return true;
    }

}
