package string3;

public class CountTriple {
    public static int countTriple(String str) {
        int count = 0;
        int len = str.length();

        for (int i = 1; i < len - 1; i++) {
            if (str.charAt(i - 1) == str.charAt(i) && str.charAt(i) == str.charAt(i + 1))
                count++;
        }
        return count;
    }

}
