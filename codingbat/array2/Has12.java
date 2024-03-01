package array2;

public class Has12 {
    public static boolean has12(int[] nums) {
        int len = nums.length;

        boolean has1 = false;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1)
                has1 = true;

            if (nums[i] == 2 && has1)
                return true;
        }
        return false;
    }

}
