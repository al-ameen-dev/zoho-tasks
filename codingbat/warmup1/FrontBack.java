package warmup1;

public class FrontBack {
    public static String frontBack(String str) {
        if (str.length() != 0) {
            char[] charray = new char[str.length()];
            charray[0] = str.charAt(str.length() - 1);
            charray[str.length() - 1] = str.charAt(0);
            for (int i = 1; i < str.length() - 1; i++) {
                charray[i] = str.charAt(i);
            }
            return String.valueOf(charray);
        }
        return str;

    }

}
