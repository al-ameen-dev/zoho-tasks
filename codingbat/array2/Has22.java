package array2;

public class Has22 {
    public static boolean has22(int[] nums) {

        int len = nums.length;

        if (len == 0 || len == 1)
            return false;

        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2)
                return true;
        }
        return false;
    }

}
