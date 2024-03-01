package warmup1;

public class SleepIn {
  public static boolean sleepIn(boolean weekday, boolean vacation) {
    if (weekday == false && vacation == false) {
      return true;
    } else if (weekday == true && vacation == false) {
      return false;
    } else {
      return true;
    }

  }
}
