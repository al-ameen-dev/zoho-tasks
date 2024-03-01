package string2;

public class OneTwo {
    public static String oneTwo(String str) {
        String res = "";
        int len = str.length();

        for (int i = 0; i < len - 2; i += 3) {
            res += str.charAt(i + 1) + "" + str.charAt(i + 2) + "" + str.charAt(i);
        }
        return res;
    }

}
