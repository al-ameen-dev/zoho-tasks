package array3;

public class MaxSpan {
    public static int maxSpan(int[] nums) {

        int count = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (nums[i] == nums[j] && count < Math.abs(j - i) + 1) {
                    count = Math.abs(j - i) + 1;
                }
            }
        }
        return count;
    }

}
