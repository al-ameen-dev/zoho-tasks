package array2;

public class BigDiff {
    public static int bigDiff(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return Math.abs(max - min);
    }

}
