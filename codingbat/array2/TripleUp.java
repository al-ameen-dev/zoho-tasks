package array2;

public class TripleUp {
    public static boolean tripleUp(int[] nums) {

        int len = nums.length;

        for (int i = 0; i < len - 2; i++) {
            if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2])
                return true;
        }
        return false;
    }

}
