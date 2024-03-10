package functional1;
import java.util.*;

public class Doubling {
    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
      }
      
}
