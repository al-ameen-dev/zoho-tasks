package warmup1;

public class DelDel {
    public static String delDel(String str) {

        StringBuilder sb = new StringBuilder();
        if (str.length() > 3) {
            if (str.charAt(1) == 'd' && str.charAt(2) == 'e' && str.charAt(3) == 'l') {
                for (int i = 0; i < str.length(); i++) {
                    if (i != 1 && i != 2 && i != 3)
                        sb.append(str.charAt(i));
                }
                return sb.toString();
            } else
                return str;
        }
        return str;
    }

}
