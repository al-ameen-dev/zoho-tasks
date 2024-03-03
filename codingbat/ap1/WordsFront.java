package ap1;

public class WordsFront {
  public static String[] wordsFront(String[] words, int n) {

    String[] newarr = new String[n];
    for (int i = 0; i < n; i++)
      newarr[i] = words[i];

    return newarr;
  }

}
