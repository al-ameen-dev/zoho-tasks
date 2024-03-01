package array2;

public class No14 {
    public static boolean no14(int[] nums) {

        int len = nums.length;
        int count1 = 0;
        int count4 = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 1)
                count1 += 1;
            if (nums[i] == 4)
                count4 += 1;
        }
        if (count1 >= 1 && count4 >= 1)
            return false;
        return true;
    }

}
