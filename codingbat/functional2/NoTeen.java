package functional2;
import java.util.*;
import java.util.stream.*;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        nums = nums.stream().filter(n -> n < 13 || n > 19).collect(Collectors.toList());
        return nums;
      }
      
}
