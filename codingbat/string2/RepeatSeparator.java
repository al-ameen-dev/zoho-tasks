package string2;

public class RepeatSeparator {
    public static String repeatSeparator(String word, String sep, int count) {
        String res = "";
        
        for(int i=0;i<count;i++)
        {
          res+=word;
          if(i<count-1)
            res+=sep;
        }
        return res;
      }
      
}
