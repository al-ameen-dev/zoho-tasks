package array2;

public class FizzArray {
    public static int[] fizzArray(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = i;

        return arr;
    }

}
