package map1;

import java.util.*;

public class Topping3 {
    public static Map<String, String> topping3(Map<String, String> map) {

        if (map.containsKey("potato") && !map.get("potato").equals(""))
            map.put("fries", map.get("potato"));
        if (map.containsKey("salad") && !map.get("salad").equals(""))
            map.put("spinach", map.get("salad"));

        return map;
    }

}
