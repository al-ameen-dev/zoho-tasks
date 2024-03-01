package array2;

public class Either24 {
    public static boolean either24(int[] nums) {
  
        int count2 = 0;
        int count4 = 0;
        int len = nums.length;
        for(int i=0;i<len-1;i++)
        {
          if(nums[i] == 2 && nums[i+1] == 2)
            count2 += 1;
          else if(nums[i] == 4 && nums[i+1] == 4)
            count4 += 1;
        }
        if(count2 >=1 && count4 >= 1)
          return false;
        else if(count2 ==0 && count4 ==0)
          return false;
        return true;
      }
      
}
