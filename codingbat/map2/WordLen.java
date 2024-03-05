package map2;
import java.util.*;

public class WordLen {
    public static Map<String, Integer> wordLen(String[] strings) {
  
        Map<String, Integer> m = new HashMap<>();
        
        for(int i=0;i<strings.length;i++)
        {
          if(!m.containsKey(strings[i]))
            m.put(strings[i],strings[i].length());
        }
        
        return m;
      }
      
}
