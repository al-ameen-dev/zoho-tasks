package array1;

public class RotateLeft3 {
    public static int[] rotateLeft3(int[] nums) {
        int[] newarray = new int[3];
        newarray[0] = nums[1];
        newarray[1] = nums[2];
        newarray[2] = nums[0];
        return newarray;
    }
}
