package string1;

public class MinCat {
    public static String minCat(String a, String b) {
        int shortest = a.length() < b.length() ? a.length() : b.length();
        return a.substring(a.length() - shortest, a.length()) + b.substring(b.length() - shortest, b.length());

    }
}
