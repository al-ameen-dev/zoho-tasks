package warmup2;

public class NoTriples {
    public static boolean noTriples(int[] nums) {

        int len = nums.length;
        boolean noTriple = false;
        if (len > 2) {
            for (int i = 1; i < len - 1; i++) {
                if (nums[i] == nums[i - 1] && nums[i] == nums[i + 1]) {
                    noTriple = false;
                    break;
                } else {
                    noTriple = true;
                }
            }
        } else
            noTriple = true;
        return noTriple;
    }

}
