package warmup1;

public class Close10 {
    public static int close10(int a, int b) {
        int aResult = Math.abs(a-10);
        int bResult = Math.abs(b-10);
        if(aResult < bResult)
          return a;
        else if(aResult==bResult)
          return 0;
        else 
          return b;
      }
      
}
