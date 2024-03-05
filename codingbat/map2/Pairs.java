package map2;
import java.util.*;

public class Pairs {
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> m = new HashMap<>();
        for(int i=0;i<strings.length;i++)
        {
          m.put(""+strings[i].charAt(0),""+strings[i].charAt(strings[i].length()-1));
        }
        return m;
      }      
}
