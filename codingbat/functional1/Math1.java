package functional1;
import java.util.*;

public class Math1 {
    public static List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n+1)*10);
        return nums;
      }
      
}
