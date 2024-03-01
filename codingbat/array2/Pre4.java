package array2;

public class Pre4 {
    public static int[] pre4(int[] nums) {
        int len = nums.length;
        int[] arr;
        int s = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 4) {
                s = i;
                break;
            }
        }
        arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = nums[i];
        }
        return arr;

    }

}
