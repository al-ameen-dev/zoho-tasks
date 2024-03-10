package functional2;
import java.util.*;
import java.util.stream.*;

public class No34 {
    public static List<String> no34(List<String> strings) {
        strings = strings.stream().filter(str->str.length() != 3 && str.length() != 4).collect(Collectors.toList());
        return strings;
      }
      
}
