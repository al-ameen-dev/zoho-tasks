package functional2;
import java.util.*;
import java.util.stream.*;

public class No9 {
    public static List<Integer> no9(List<Integer> nums) {
        nums = nums.stream().filter(n->n%10 != 9).collect(Collectors.toList());
        return nums;
      }
      
}
