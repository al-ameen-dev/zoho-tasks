package functional2;
import java.util.*;
import java.util.stream.*;

public class NoLong {
    public static List<String> noLong(List<String> strings) {
        strings = strings.stream().filter(str -> str.length()<4).collect(Collectors.toList());
        return strings;
      }
      
}
