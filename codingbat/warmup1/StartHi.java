package warmup1;

public class StartHi {
  public static boolean startHi(String str) {
    if (str.length() < 2)
      return false;
    return str.substring(0, 2).equals("hi");
  }

}
