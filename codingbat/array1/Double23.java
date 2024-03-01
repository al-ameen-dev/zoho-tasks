package array1;

public class Double23 {
    public static boolean double23(int[] nums) {
        if (nums.length < 1) {
            return false;
        } else {
            if (nums.length == 2)
                return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
            else
                return false;
        }
    }
}
