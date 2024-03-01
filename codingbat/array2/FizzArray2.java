package array2;

public class FizzArray2 {
    public static String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = "" + i;
        return arr;
    }

}
