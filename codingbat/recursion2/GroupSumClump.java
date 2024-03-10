package recursion2;

public class GroupSumClump {
    public static boolean groupSumClump(int start, int[] nums, int target) {
        int sum = 0;
        int cnt = 1;
        if(nums.length <= start) {
          if(target == 0) 
            return true;
          return false;
        }
          sum = nums[start];
          for (int i = start + 1; i < nums.length; i++)
            if (nums[i] == nums[start]) {
              sum += nums[i];
              cnt++;
            }
        return groupSumClump(start + cnt, nums, target - sum) || groupSumClump(start + cnt, nums, target);
      }
      
}
