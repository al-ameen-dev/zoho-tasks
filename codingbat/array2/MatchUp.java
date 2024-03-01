package array2;

public class MatchUp {
    public static int matchUp(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff >= 1 && diff <= 2)
                count += 1;
        }
        return count;
    }

}
