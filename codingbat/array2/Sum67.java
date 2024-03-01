package array2;

public class Sum67 {
    public static int sum67(int[] nums) {

        int sum = 0;
        int len = nums.length;
        boolean canSum = true;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 6)
                canSum = false;

            if (canSum)
                sum += nums[i];

            if (nums[i] == 7)
                canSum = true;

        }
        return sum;
    }

}
