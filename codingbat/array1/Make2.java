package array1;

public class Make2 {
    public static int[] make2(int[] a, int[] b) {
        int[] newarray = new int[2];
        if (a.length < 1 && b.length > 0)
            return b;
        else if (a.length > 1) {
            newarray[0] = a[0];
            newarray[1] = a[1];
            return newarray;
        } else if (a.length < 2 && b.length > 0) {
            newarray[0] = a[0];
            newarray[1] = b[0];
            return newarray;
        } else {
            newarray[0] = a[0];
            newarray[1] = a[1];
            return newarray;
        }
    }

}
