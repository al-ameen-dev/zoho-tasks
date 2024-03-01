package array2;

public class Only14 {
    public static boolean only14(int[] nums) {

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 1 && nums[i] != 4)
                return false;
        }
        return true;
    }

}
