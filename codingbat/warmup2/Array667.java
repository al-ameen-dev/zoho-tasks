package warmup2;

public class Array667 {
    public static int array667(int[] nums) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if ((nums[i] == 6 && nums[i + 1] == 6) || (nums[i] == 6 && nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

}
