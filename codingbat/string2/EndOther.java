package string2;

public class EndOther {
    public static boolean endOther(String a, String b) {
        if (a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase()))
            return true;
        return false;
    }

}
