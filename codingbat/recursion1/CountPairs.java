package recursion1;

public class CountPairs {
    public static int countPairs(String str) {
        if (str.length() == 0)
            return 0;

        if (str.length() < 3)
            return 0;
        if (str.charAt(0) == str.charAt(2))
            return 1 + countPairs(str.substring(1, str.length()));

        return countPairs(str.substring(1, str.length()));
    }

}
