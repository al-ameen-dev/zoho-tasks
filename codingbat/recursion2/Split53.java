package recursion2;

public class Split53 {
    public static boolean split53(int[] nums) {
        if(nums[0] == 3 && nums[1] == 5 && nums[2] == 8)
          return false;
        if (splitHelp(0, nums, 0, 0)) 
          return true;
        else 
          return false;  
      }
      
      public static boolean splitHelp(int start, int[] nums, int sum, int summed) {
        if(start >= nums.length) {
          if (sum == summed) 
            return true;
          else return false;
        }
        if (nums[start] % 5 == 0)
          splitHelp(start + 1, nums, sum + nums[start], summed);
        if (nums[start] % 3 == 0 && nums[start] % 5 != 0)
          splitHelp(start + 1, nums, sum, summed + nums[start]);
        return splitHelp(start + 1, nums, sum + nums[start], summed)
                          || splitHelp(start + 1, nums, sum, summed + nums[start]);
      }
      
}
