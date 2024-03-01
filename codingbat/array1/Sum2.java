package array1;

public class Sum2 {
    public static int sum2(int[] nums) {
        if (nums.length < 2) {
            return nums.length == 0 ? 0 : nums[0];
        } else {
            return nums[0] + nums[1];
        }
    }

}
