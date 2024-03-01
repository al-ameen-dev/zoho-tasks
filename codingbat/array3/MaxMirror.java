package array3;

public class MaxMirror {
    public static int maxMirror(int[] nums) {
        int len = nums.length;
        int max = 0;

        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = len - 1; j >= 0 && i + count < len; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    max = Math.max(count, max);
                    count = 0;
                }
            }
            max = Math.max(count, max);
        }

        return max;
    }

}
