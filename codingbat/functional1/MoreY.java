package functional1;
import java.util.*;;

public class MoreY {
    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y"+n+"y");
        return strings;
      }
      
}
