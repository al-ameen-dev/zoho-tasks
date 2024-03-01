package string2;

public class XYZThere {
    public static boolean xyzThere(String str) {
        if (str.length() > 2 && str.substring(0, 3).equals("xyz"))
            return true;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) != '.' && str.charAt(i + 1) == 'x' && str.charAt(i + 2) == 'y'
                    && str.charAt(i + 3) == 'z')
                return true;
        }
        return false;
    }

}
