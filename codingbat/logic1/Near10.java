package logic1;

public class Near10 {
    public static boolean nearTen(int num) {
        int rem = num % 10;
        int absolute = Math.abs(rem - 10);
        if ((rem < 3 && rem >= 0) || (absolute < 3 && absolute >= 0))
            return true;
        else
            return false;
    }

}
