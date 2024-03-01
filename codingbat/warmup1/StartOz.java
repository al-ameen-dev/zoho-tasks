package warmup1;

public class StartOz {
    public static String startOz(String str) {
        if(str.length()>1)
        {
          if(str.charAt(0) == 'o' && str.charAt(1) == 'z')
          {
            return "oz";
          }
          else if(str.charAt(0) == 'o' && !(str.charAt(1)=='z'))
          {
            return "o";
          }
          else if(!(str.charAt(0) == 'o') && str.charAt(1)=='z')
          {
            return "z";
          }
          else
            return "";
        }
        else if(str.length() ==1)
        {
          return (str.charAt(0) == 'o')?"o":(str.charAt(0) == 'z'?"z":"");
        }
        else
          return "";
      }
      
}
