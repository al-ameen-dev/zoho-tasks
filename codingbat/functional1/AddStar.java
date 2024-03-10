package functional1;
import java.util.*;

public class AddStar {
    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(str -> str+"*");
        return strings;
      }
      
}
