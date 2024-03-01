package string3;

public class MaxBlock {
    public static int maxBlock(String str) {
        int len = str.length();
        int prevcount = 1;
        int count = 1;

        if (len == 0)
            return 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
                else
                    break;
            }
            if (prevcount < count) {
                prevcount = count;
            }
            count = 1;
        }
        return prevcount;
    }
}
