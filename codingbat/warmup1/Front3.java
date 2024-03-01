package warmup1;

public class Front3 {
    public static String front3(String str) {
        int size = (str.length() > 2 ? 3 : str.length());
        char[] charray = new char[size * 3];
        int index = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < size; j++) {
                charray[index++] = str.charAt(j);
            }
        }
        return String.valueOf(charray);
    }
}
