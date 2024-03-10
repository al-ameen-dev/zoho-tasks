package functional1;
import java.util.*;

public class Square {
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n*n);
        return nums;
      }
      
}
