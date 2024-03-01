package array1;

public class MidThree {
    public static int[] midThree(int[] nums) {
        int[] newarray = new int[3];
        if (nums.length > 2) {
            newarray[0] = nums[(nums.length / 2) - 1];
            newarray[1] = nums[(nums.length / 2)];
            newarray[2] = nums[(nums.length / 2) + 1];
            return newarray;
        }
        return nums;
    }

}
