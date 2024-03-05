package map2;
import java.util.*;

public class WordCount {
    public static Map<String, Integer> wordCount(String[] strings) {
  
        Map<String, Integer> m = new HashMap<>();
        
        for(int i=0;i<strings.length;i++)
        {
          if(m.containsKey(strings[i]))
          {
            int num = m.get(strings[i]);
            num += 1;
            m.put(strings[i],num);
          }
          else
            m.put(strings[i],1);
        }
        return m;
      }
}
