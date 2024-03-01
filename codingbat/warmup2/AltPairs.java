package warmup2;

public class AltPairs {
    public static String altPairs(String str) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        if(len != 0)
        {
          sb.append(str.charAt(0));
          for(int i=0;i<len;i+=4)
          {
            if(i+1 < str.length())
              sb.append(str.charAt(i+1));
            if(i+4 <str.length())
              sb.append(str.charAt(i+4));
            else
              break;
          }
        }
        return sb.toString();
      }
      
}
