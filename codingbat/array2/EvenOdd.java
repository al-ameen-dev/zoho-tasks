package array2;

public class EvenOdd {
    public static int[] evenOdd(int[] nums) {
        int len = nums.length;

        for (int i = 0, j = 1; i < len && j < len;) {
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else if (nums[i] % 2 != 1) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return nums;
    }

}
