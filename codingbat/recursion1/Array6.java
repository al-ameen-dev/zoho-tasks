package recursion1;

public class Array6 {
    public static boolean array6(int[] nums, int index) {
        if (nums.length == 0 || index == nums.length)
            return false;

        if (nums[index] == 6)
            return true;
        return array6(nums, index + 1);
    }

}
