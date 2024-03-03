package ap1;

public class BigHeights {
    public static int bigHeights(int[] heights, int start, int end) {

        int count = 0;

        for (int i = start; i <= end - 1; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5)
                count++;
        }
        return count;
    }

}
