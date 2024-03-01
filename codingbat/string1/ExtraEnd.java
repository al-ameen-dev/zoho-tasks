package string1;

public class ExtraEnd {
    public static String extraEnd(String str) {
        String last = str.substring(str.length()-2,str.length());
        return last+last+last;
      }
      
}
