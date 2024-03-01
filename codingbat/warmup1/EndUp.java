package warmup1;

public class EndUp {
    public static String endUp(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int limit = (length == 3) ? 0 : length > 3 ? Math.abs(length - 3) : 0;
        if (length < 3)
            return str.toUpperCase();
        else {
            for (int i = 0; i < length; i++) {
                if (i < limit)
                    sb.append(str.charAt(i));
                else
                    sb.append(String.valueOf(str.charAt(i)).toUpperCase());
            }
            return sb.toString();
        }

    }

}
