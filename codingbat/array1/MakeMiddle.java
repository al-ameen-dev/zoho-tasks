package array1;

public class MakeMiddle {
    public static int[] makeMiddle(int[] nums) {
        int[] newarray = new int[2];
        newarray[0] = nums[(nums.length / 2) - 1];
        newarray[1] = nums[nums.length / 2];
        return newarray;
    }

}
