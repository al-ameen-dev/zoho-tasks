package functional1;
import java.util.*;

public class Lower {
    public static List<String> lower(List<String> strings) {
        strings.replaceAll(n->n.toLowerCase());
        return strings;
      }
      
}
