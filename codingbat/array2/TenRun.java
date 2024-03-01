package array2;

public class TenRun {
    public static int[] tenRun(int[] nums) {

        int len = nums.length;
        int temp = -1;
        for (int i = 0; i < len; i++) {
            if (nums[i] % 10 == 0)
                temp = nums[i];
            if (temp != -1)
                nums[i] = temp;
        }
        return nums;
    }

}
