package array2;

public class ZeroMax {
    public static int[] zeroMax(int[] nums) {

        int len = nums.length;
        int odd = -1;

        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1 && odd < nums[i])
                odd = nums[i];
            if (nums[i] == 0 && odd != -1)
                nums[i] = odd;
        }
        return nums;
    }

}
