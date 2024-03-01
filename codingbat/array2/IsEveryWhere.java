package array2;

public class IsEveryWhere {
    public static boolean isEverywhere(int[] nums, int val) {
        int len = nums.length;

        for (int i = 0; i < len - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val)
                return false;
        }
        return true;
    }

}
