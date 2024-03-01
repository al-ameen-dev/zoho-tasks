package array1;

public class SameFirstLast {
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length > 0) {
            if (nums[0] == nums[nums.length - 1])
                return true;
            else
                return false;
        }
        return false;
    }
}
