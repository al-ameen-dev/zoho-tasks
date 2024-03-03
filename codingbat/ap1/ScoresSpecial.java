package ap1;

public class ScoresSpecial {
  public static int scoresSpecial(int[] a, int[] b) {

    return largestSpecial(a) + largestSpecial(b);
  }

  private static int largestSpecial(int[] arr) {
    int max = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 10 == 0) {
        if (max < arr[i])
          max = arr[i];
      }
    }
    return max;
  }
}
