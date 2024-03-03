package ap1;

public class WordsWithout {
  public static String[] wordsWithout(String[] words, String target) {

    String[] arr;
    int count = 0, index = 0;
    for (int i = 0; i < words.length; i++) {
      if (!words[i].equals(target))
        count++;
    }
    arr = new String[count];
    for (int i = 0; i < words.length; i++) {
      if (!words[i].equals(target))
        arr[index++] = words[i];
    }
    return arr;
  }

}
