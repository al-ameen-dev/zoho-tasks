package functional2;
import java.util.*;
import java.util.stream.*;

public class NoNeg {
    public static List<Integer> noNeg(List<Integer> nums) {
        nums = nums.stream().filter(n -> n> -1).collect(Collectors.toList());
        return nums;
      }
      
}
