package array1;

public class PlusTwo {
    public static int[] plusTwo(int[] a, int[] b) {
        int[] newarray = new int[4];
        newarray[0] = a[0];
        newarray[1] = a[1];
        newarray[2] = b[0];
        newarray[3] = b[1];
        return newarray;
    }

}
