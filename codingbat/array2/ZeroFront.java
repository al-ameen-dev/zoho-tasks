package array2;

public class ZeroFront {
    public static int[] zeroFront(int[] nums) {
        int len = nums.length;

        for (int i = 0, j = 1; i < len && j < len;) {
            if ((nums[i] != 0 && nums[j] == 0)) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else if (nums[i] == 0) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return nums;
    }

}
