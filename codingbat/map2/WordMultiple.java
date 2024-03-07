package map2;
import java.util.*;;

public class WordMultiple {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
  
        Map<String, Boolean> map = new HashMap<>();
        for(int i=0;i<strings.length;i++)
        {
          String key = strings[i];
          if(map.containsKey(key))
          {
            map.put(key,true);
          }
          else
          {
            map.put(key,false);
          }
        }
        return map;
      }
      
}
