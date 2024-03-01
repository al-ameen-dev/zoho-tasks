package array2;

public class ModThree {
    public static boolean modThree(int[] nums) {

        int len = nums.length;

        if (len < 3)
            return false;

        for (int i = 0; i < len - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0)
                return true;
            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1)
                return true;
        }
        return false;
    }

}
