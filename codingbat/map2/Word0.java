package map2;

import java.util.*;

public class Word0 {
    public static Map<String, Integer> word0(String[] strings) {
  
        Map<String, Integer> m = new HashMap<>();
        for(int i=0;i<strings.length;i++)
        {
          m.put(strings[i],0);
        }
        return m;
      }
      
}
