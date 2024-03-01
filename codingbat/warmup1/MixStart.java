package warmup1;

public class MixStart {
    public static boolean mixStart(String str) {

        if (str.length() > 2) {
            String word = str.substring(0, 3);
            if (word.contains("ix"))
                return true;
        }
        return false;
    }

}
