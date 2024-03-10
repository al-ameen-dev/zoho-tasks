package functional2;
import java.util.*;
import java.util.stream.*;

public class NoZ {
    public static List<String> noZ(List<String> strings) {
        strings = strings.stream().filter(str -> !str.contains("z")).collect(Collectors.toList());
        return strings;
      }
      
}
