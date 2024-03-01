package string3;

public class EqualIsNot {
    public static boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's')
                isCount++;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't')
                notCount++;
        }

        return isCount == notCount;
    }

}
