package string2;

public class SameStarChar {
    public static boolean sameStarChar(String str) {
        if (str.length() < 3)
            return true;
        int count = 0;
        int countMatch = 0;
        for (int i = 1; i < str.length() - 1; i++)
            if (str.charAt(i) == '*')
                count++;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) == str.charAt(i + 1))
                countMatch++;
        }
        return count == countMatch;
    }

}
