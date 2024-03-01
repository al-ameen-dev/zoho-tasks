package array3;

public class SquareUp {
    public static int[] squareUp(int n) {
        if (n == 0)
            return new int[] {};
        int[] arr = new int[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1)
                    continue;
                arr[i * n + j] = n - j;
            }
        }
        return arr;
    }

}
