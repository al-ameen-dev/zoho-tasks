package array2;

public class Sum28 {
    public static boolean sum28(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 2)
                sum += nums[i];
        }
        return sum == 8;
    }

}
