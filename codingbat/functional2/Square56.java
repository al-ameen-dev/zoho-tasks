package functional2;
import java.util.*;
import java.util.stream.*;

public class Square56 {
    public static List<Integer> square56(List<Integer> nums) {
        nums = nums.stream().map(n->(n*n)+10).filter(n->n%10 != 5 && n%10 !=6).collect(Collectors.toList());
        return nums;
      }
      
}
