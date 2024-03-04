package map1;

import java.util.*;

public class Topping2 {
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream") && !map.get("ice cream").equals(""))
            map.put("yogurt", map.get("ice cream"));
        if (map.containsKey("spinach") && !map.get("spinach").equals(""))
            map.put("spinach", "nuts");

        return map;
    }

}
