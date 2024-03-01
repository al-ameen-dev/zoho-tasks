package array1;

public class MaxTriple {
    public static int maxTriple(int[] nums) {
        int a = nums[0];
        int b = nums[(nums.length / 2)];
        int c = nums[nums.length - 1];
        if (a > b && a > c) {
            return a;
        } else {
            if (b > c)
                return b;
            else
                return c;
        }
    }

}
