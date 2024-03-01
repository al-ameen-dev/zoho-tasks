package array1;

public class MaxEnd3 {
    public static int[] reverse3(int[] nums) {
        int[] newarray = new int[3];
        newarray[0] = nums[2];
        newarray[1] = nums[1];
        newarray[2] = nums[0];
        return newarray;
    }
}
