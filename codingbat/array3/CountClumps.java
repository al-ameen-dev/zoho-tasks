package array3;

public class CountClumps {
    public static int countClumps(int[] nums) {

        int count = 0;
        int len = nums.length;

        for (int i = 0; i < len;) {
            int length = 1;
            int val = nums[i];
            i++;
            while (i < len && val == nums[i]) {
                i++;
                length++;
            }
            if (length > 1)
                count++;
        }
        return count;
    }

}
