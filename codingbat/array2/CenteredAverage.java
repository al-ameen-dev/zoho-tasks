package array2;

import java.util.Arrays;

public class CenteredAverage {
    public static int centeredAverage(int[] nums) {

        int sum = 0;
        int len = nums.length;
        Arrays.sort(nums);

        for (int i = 1; i < len - 1; i++) {
            sum += nums[i];
        }
        return sum / (len - 2);
    }

}
