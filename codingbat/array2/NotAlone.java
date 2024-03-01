package array2;

public class NotAlone {
    public static int[] notAlone(int[] nums, int val) {

        int len = nums.length;
        for (int i = 1; i < len - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                int large = Math.max(nums[i - 1], nums[i + 1]);
                nums[i] = large;
            }
        }
        return nums;
    }

}
