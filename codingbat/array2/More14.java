package array2;

public class More14 {
  public boolean more14(int[] nums) {
    int len = nums.length;
    int count1 = 0;
    int count4 = 0;

    for (int i = 0; i < len; i++) {
      if (nums[i] == 1)
        count1 += 1;
      else if (nums[i] == 4)
        count4 += 1;
    }
    return count1 > count4;
  }

}
