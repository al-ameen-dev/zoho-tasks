package map1;
import java.util.*;

public class MapAB3 {
    public static Map<String, String> mapAB3(Map<String, String> map) {
        if(map.containsKey("a") && !map.containsKey("b"))
          map.put("b",map.get("a"));
        else if(map.containsKey("b") && !map.containsKey("a"))
          map.put("a",map.get("b"));
          
        return map;
      }
      
}
