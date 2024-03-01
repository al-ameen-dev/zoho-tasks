package array2;

public class ShiftLeft {
    public static int[] shiftLeft(int[] nums) {
        int len = nums.length;

        if (len == 0)
            return nums;

        int temp = nums[0];

        for (int i = 1; i < len; i++) {
            nums[i - 1] = nums[i];
        }
        nums[len - 1] = temp;
        return nums;
    }

}
