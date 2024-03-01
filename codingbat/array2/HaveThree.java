package array2;

public class HaveThree {
    public static boolean haveThree(int[] nums) {
        int len = nums.length;
        int count = 0;
        boolean isNext = false;
        if (len < 3)
            return false;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 3)
                count += 1;
        }
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] == 3)
                isNext = true;
        }
        if (count != 3 || isNext == true)
            return false;
        return true;
    }

}
