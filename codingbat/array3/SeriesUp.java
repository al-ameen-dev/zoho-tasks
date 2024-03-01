package array3;

public class SeriesUp {
    public static int[] seriesUp(int n) {
        int size = n * (n + 1) / 2;
        int[] arr = new int[size];

        int cursor = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[cursor++] = j + 1;
            }
        }
        return arr;
    }

}
