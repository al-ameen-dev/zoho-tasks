package array1;

public class BiggerTwo {
    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumA >= sumB)
            return a;
        else
            return b;
    }

}
