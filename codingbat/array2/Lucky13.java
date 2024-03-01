package array2;

public class Lucky13 {
    public static boolean lucky13(int[] nums) {

        int len = nums.length;
        if (len == 0)
            return true;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1 || nums[i] == 3)
                return false;
        }
        return true;
    }

}
