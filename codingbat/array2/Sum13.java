package array2;

public class Sum13 {
    public static int sum13(int[] nums) {
        int sum = 0;
        int len = nums.length;

        if (len == 0)
            return 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            } else {
                i += 1;
            }

        }
        return sum;
    }

}
