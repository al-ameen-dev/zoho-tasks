package recursion2;

public class SplitOdd10 {
    public static boolean splitOdd10(int[] nums) {
        if (splitHelp(0, nums, 0, 0)) return true;
        else return false;
      }
      public static boolean splitHelp(int start, int[] nums, int sum, int summed) {
        if(nums.length <= start) {
          if (sum % 10 == 0) 
            if (summed % 2 == 1) return true;
          return false;
        }
        if (splitHelp(start + 1, nums, sum + nums[start], summed)) 
          return true;
        if (splitHelp(start + 1, nums, sum, summed + nums[start])) 
          return true;
        return false;
      }
      
}
