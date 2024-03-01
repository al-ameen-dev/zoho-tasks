package warmup1;

public class BackAround {
    public static String backAround(String str) {

        int length = str.length();
        int index = 1;
        char[] charray = new char[length + 2];
        charray[0] = str.charAt(length - 1);
        charray[length + 1] = str.charAt(length - 1);
        for (int i = 0; i < length; i++) {
            charray[index++] = str.charAt(i);
        }
        return String.valueOf(charray);
    }

}
