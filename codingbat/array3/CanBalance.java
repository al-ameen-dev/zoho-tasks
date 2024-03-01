package array3;

public class CanBalance {
    public static boolean canBalance(int[] nums) {

        int len = nums.length;
        int sum = 0;
        int midsum = 0;
        for (int i = 0; i < len; i++)
            sum += nums[i];

        if (sum % 2 != 0)
            return false;
        else {
            int mid = sum / 2;
            for (int i = 0; i < len; i++) {
                midsum += nums[i];
                if (midsum == mid)
                    return true;
            }
        }
        return false;
    }

}
