package functional1;
import java.util.*;;

public class RightDigit {
    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n->n%10);
        return nums;
      }
}
