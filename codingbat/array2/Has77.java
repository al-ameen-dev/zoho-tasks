package array2;

public class Has77 {
    public static boolean has77(int[] nums) {

        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7)
                return true;
            else if (i < len - 2 && nums[i] == 7 && nums[i + 1] != 7 && nums[i + 2] == 7)
                return true;
        }
        return false;
    }

}
