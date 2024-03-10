package functional2;
import java.util.*;
import java.util.stream.*;

public class Two2 {
    public static List<Integer> two2(List<Integer> nums) {
        nums = nums.stream().map(n->n*2).filter(n->n%10 != 2).collect(Collectors.toList());
        return nums;
      }
      
}
