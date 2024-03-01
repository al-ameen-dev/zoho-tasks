package warmup2;

public class Has271 {
    public static boolean has271(int[] nums) {
        int len = nums.length;
        boolean is271 = false;
        if (len > 2) {
            for (int i = 0; i < len - 2; i++) {
                if ((nums[i] + 5 == nums[i + 1] && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2)) {
                    is271 = true;
                    break;
                }
            }
        } else {
            is271 = false;
        }
        return is271;
    }

}
