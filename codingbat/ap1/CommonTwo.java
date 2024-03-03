package ap1;

public class CommonTwo {
    public static int commonTwo(String[] a, String[] b) {

        int[] found = new int[256];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    int asci = (int) a[i].charAt(0);
                    if (found[asci] == 0) {
                        found[asci]++;
                        count++;
                    }

                }
            }
        }
        return count;
    }

}
