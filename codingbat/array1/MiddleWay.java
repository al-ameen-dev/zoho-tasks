package array1;

public class MiddleWay {
    public static int[] middleWay(int[] a, int[] b) {
        int[] newarray = new int[2];
        newarray[0] = a[a.length / 2];
        newarray[1] = b[b.length / 2];
        return newarray;
    }
}
