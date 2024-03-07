package map2;
import java.util.*;

public class WordAppend {
    public static String wordAppend(String[] strings) {
  
        Map<String, Integer> map = new HashMap<>();
        String str = "";
        for(int i=0;i<strings.length;i++)
        {
          String key = strings[i];
          if(map.containsKey(key))
          {
            int c = map.get(key);
            map.put(key,c+1);
            if(map.get(key)%2 == 0 && map.get(key) != 1)
              str += key;
          }
          else
          {
            map.put(key,1);
          }
        }
        return str;
      }
}
