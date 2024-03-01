package array3;

public class LinearIn {
    public static boolean linearIn(int[] outer, int[] inner) {

        int olen = outer.length;
        int ilen = inner.length;
        int count = 0;
        for (int i = 0, j = 0; i < olen && j < ilen;) {
            if (outer[i] == inner[j]) {
                count += 1;
                i++;
                j++;
            } else
                i++;
        }
        if (count == ilen)
            return true;
        return false;
    }

}
