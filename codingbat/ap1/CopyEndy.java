package ap1;

public class CopyEndy {
  public static int[] copyEndy(int[] nums, int count) {

    int[] indy = new int[count];
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (isEndy(nums[i]) && index < count)
        indy[index++] = nums[i];
    }
    return indy;
  }

  public static boolean isEndy(int n) {
    if ((n >= 0 && n <= 10) || (n >= 90 && n <= 100))
      return true;
    return false;
  }
}
