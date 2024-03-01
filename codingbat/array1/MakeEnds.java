package array1;

public class MakeEnds {
    public static int[] makeEnds(int[] nums) {
        int[] newarray = new int[2];
        if (nums.length > 0) {
            newarray[0] = nums[0];
            newarray[1] = nums[nums.length - 1];
            return newarray;
        } else
            return new int[] {};

    }

}
