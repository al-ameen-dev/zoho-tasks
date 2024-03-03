package ap1;

public class ScoreUp {
  public static int scoreUp(String[] key, String[] answers) {

    int mark = 0;

    for (int i = 0; i < key.length; i++) {
      if (key[i].equals(answers[i]))
        mark += 4;
      else if (!key[i].equals(answers[i]) && !answers[i].equals("?"))
        mark -= 1;
      else
        mark += 0;
    }
    return mark;
  }

}