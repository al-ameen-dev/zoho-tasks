package string3;

public class GHappy {
    public static boolean gHappy(String str) {

        int len = str.length();
        if (len == 0)
            return true;

        if ((len == 1) && str.equals("g"))
            return false;

        if ((len >= 2 && str.charAt(0) == 'g' && str.charAt(1) != 'g')
                || (str.charAt(len - 1) == 'g' && str.charAt(len - 2) != 'g'))
            return false;

        for (int i = 1; i <= len - 2; i++) {
            if (str.charAt(i - 1) != 'g' && str.charAt(i) == 'g' && str.charAt(i + 1) != 'g')
                return false;
        }
        return true;
    }

}
