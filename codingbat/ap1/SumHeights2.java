package ap1;

public class SumHeights2 {
    public static int sumHeights2(int[] heights, int start, int end) {
        int walksum = 0;

        for (int i = start; i <= end - 1; i++) {
            if (heights[i] < heights[i + 1])
                walksum += Math.abs(heights[i] - heights[i + 1]) * 2;
            else
                walksum += Math.abs(heights[i] - heights[i + 1]);
        }

        return walksum;
    }
}
