package map1;
import java.util.*;

public class MapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            int alen = map.get("a").length();
            int blen = map.get("b").length();
            if (alen == blen) {
                map.put("a", "");
                map.put("b", "");
            } else if (alen > blen) {
                map.put("c", map.get("a"));
            } else {
                map.put("c", map.get("b"));
            }
        }
        return map;
    }

}
