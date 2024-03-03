package ap1;

public class SumHeights {
    public static int sumHeights(int[] heights, int start, int end) {

        int walksum = 0;
        for (int i = start; i <= end - 1; i++) {
            walksum += Math.abs(heights[i] - heights[i + 1]);
        }

        return walksum;
    }

}
