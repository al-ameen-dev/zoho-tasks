package functional1;
import java.util.*;

public class NoX {
    public static List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replace("x",""));
        return strings;
      }
      
}
