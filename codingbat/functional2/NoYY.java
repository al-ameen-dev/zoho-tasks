package functional2;
import java.util.*;
import java.util.stream.*;

public class NoYY {
    public static List<String> noYY(List<String> strings) {
        strings = strings.stream().map(str->str+"y").filter(str -> !str.contains("yy")).collect(Collectors.toList());
        return strings;
      }
      
}
