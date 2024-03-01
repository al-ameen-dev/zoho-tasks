package array3;

public class Fix45 {
    public static int[] fix45(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len; j++) {
                if (nums[i] == 4 && nums[i + 1] != 5 && nums[i + 1] != 4 && nums[j] == 5
                        && j > 0 && nums[j - 1] != 4) {
                    int temp = nums[j];
                    nums[j] = nums[i + 1];
                    nums[i + 1] = temp;
                } else if (i == 0 && nums[i] == 5 && nums[j] != 4 && nums[j] != 5) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }

}
