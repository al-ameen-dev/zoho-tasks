package warmup1;

public class Front22 {
    public static String front22(String str) {
        int index = (str.length()>0 && str.length()<2 ? 1 : 2);
        int size = ((str.length()>0 && str.length()<2) ? 2 : 4);
        int length = str.length() + size;
        char[] charray = new char[length];
        if(str.length()>1)
        {
          charray[0] = str.charAt(0);
          charray[1] = str.charAt(1);
          charray[length-2] = charray[0];
          charray[length-1] = charray[1];
          for(int i =0 ;i<str.length();i++)
          {
            charray[index++] = str.charAt(i);
          }
          return String.valueOf(charray);
        }
        else if (str.length() == 1)
        {
          charray[0] = str.charAt(0);
          charray[2] = charray[0];
          for(int i =0 ;i<str.length();i++)
          {
            charray[index++] = str.charAt(i);
          }
          return String.valueOf(charray);
        }
        return str;
        
      }
      
}
