package array3;

public class Fix34 {
    public static int[] fix34(int[] nums) {

        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len; j++) {
                if (nums[i] == 3 && nums[i + 1] != 4 && nums[j] == 4 && nums[j - 1] != 3) {
                    int temp = nums[j];
                    nums[j] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
        return nums;
    }

}
