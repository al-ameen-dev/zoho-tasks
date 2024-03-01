package logic1;

public class ShareDigit {
    public static boolean shareDigit(int a, int b) {
        int leftA = a / 10;
        int rightA = a % 10;
        int leftB = b / 10;
        int rightB = b % 10;
        if ((leftA == rightB) || (leftA == leftB) || (rightA == rightB) || (rightA == leftB)) {
            return true;
        } else
            return false;
    }

}
