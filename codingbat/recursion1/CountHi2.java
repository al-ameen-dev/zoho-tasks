package recursion1;

public class CountHi2 {
    public static int countHi2(String str) {
        if (str.length() < 2)
            return 0;
        if (str.length() == 2 && str.equals("hi"))
            return 1;
        if (str.substring(str.length() - 2, str.length()).equals("hi") && str.charAt(str.length() - 3) != 'x')
            return 1 + countHi2(str.substring(0, str.length() - 1));

        return countHi2(str.substring(0, str.length() - 1));
    }

}
