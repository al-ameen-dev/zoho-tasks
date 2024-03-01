package warmup2;

public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i < 4) {
                if (nums[i] == 9)
                    return true;
            } else {
                break;
            }
        }
        return false;
    }
}
