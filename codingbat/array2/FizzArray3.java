package array2;

public class FizzArray3 {
    public static int[] fizzArray3(int start, int end) {
        int size = Math.abs(start - end);
        int[] arr = new int[size];

        for (int i = 0, val = start; i < arr.length; val++, i++)
            arr[i] = val;
        return arr;
    }

}
