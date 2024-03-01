package warmup1;

public class NearHundred {
  public static boolean nearHundred(int n) {
    int nearH = Math.abs(n - 100);
    int nearT = Math.abs(n - 200);
    if ((nearH >= 0 && nearH <= 10) || (nearT >= 0 && nearT <= 10)) {
      return true;
    } else {
      return false;
    }
  }
}
