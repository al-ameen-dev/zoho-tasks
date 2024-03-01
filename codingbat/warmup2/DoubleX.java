package warmup2;

public class DoubleX {
    public static boolean doubleX(String str) {
        boolean isX = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.charAt(i + 1) == 'x') {
                    isX = true;
                    break;
                } else {
                    isX = false;
                    break;
                }
            }
        }
        return isX;
    }

}
