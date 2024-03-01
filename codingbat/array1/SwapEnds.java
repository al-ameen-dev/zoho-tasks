package array1;

public class SwapEnds {
    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        if (nums.length > 0) {
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
            return nums;
        }
        return new int[] {};
    }

}
