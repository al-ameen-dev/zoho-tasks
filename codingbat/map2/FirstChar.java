package map2;
import java.util.*;

public class FirstChar {
    public static Map<String, String> firstChar(String[] strings) {
  
        Map<String, String> m = new HashMap<>();
        for(int i=0;i<strings.length;i++)
        {
          String key = strings[i].charAt(0)+"";
          if(m.containsKey(key))
          {
            String temp = m.get(key);
            temp +=strings[i];
            m.put(key,temp);
          }
          else
          {
            m.put(key,strings[i]);
          }
        }
        return m;
      }
      
}
