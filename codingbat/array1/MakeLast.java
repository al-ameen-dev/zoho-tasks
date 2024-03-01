package array1;

public class MakeLast {
    public static int[] makeLast(int[] nums) {
        int[] newarray = new int[nums.length * 2];
        newarray[newarray.length - 1] = nums[nums.length - 1];
        return newarray;
    }
}
