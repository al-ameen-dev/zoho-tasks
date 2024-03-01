package warmup2;

public class Last2 {
    public int last2(String str) {
        int count = 0;
        int len = str.length();
        for (int i = 0; i < len - 2; i++) {
            if ((str.charAt(i) == str.charAt(len - 2)) && (str.charAt(i + 1) == str.charAt(len - 1))) {
                count++;
            }
        }
        return count;
    }

}
