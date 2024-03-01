package recursion1;

public class ChangePi {
    public static String changePi(String str) {
        if (str.length() < 2)
            return str;

        if (str.substring(str.length() - 2, str.length()).equals("pi"))
            return changePi(str.substring(0, str.length() - 2)) + "3.14";

        return changePi(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
    }

}
