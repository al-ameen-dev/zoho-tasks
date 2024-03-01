package array2;

public class Post4 {
    public static int[] post4(int[] nums) {
        int len = nums.length;
        int index = 0;
        int[] arr;
        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                index = i + 1;
                break;
            }
        }
        int size = Math.abs(index - len);
        arr = new int[size];
        for (int val = 0, i = index; i < len; i++, val++) {
            arr[val] = nums[i];
        }
        return arr;
    }

}
