package ap1;

public class MergeTwo {
    public static String[] mergeTwo(String[] a, String[] b, int n) {

        String[] arr = new String[n];
        int index = 0, i = 0, j = 0;
        while (i < a.length && index < n) {
            int ch1 = (int) a[i].charAt(0);
            int ch2 = (int) b[j].charAt(0);

            if (ch1 < ch2 && index < n) {
                arr[index++] = a[i];
                i++;
            } else if (ch1 > ch2) {
                arr[index++] = b[j];
                j++;
            } else if (ch1 == ch2) {
                arr[index++] = a[i];
                i++;
                j++;
            }

        }
        return arr;
    }

}
