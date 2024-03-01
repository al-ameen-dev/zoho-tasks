package array2;

public class WithoutTen {
    public static int[] withoutTen(int[] nums) {

        int len = nums.length;
        int[] arr = new int[len];
        int cursor = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 10)
                arr[cursor++] = nums[i];
        }
        return arr;
    }

}
