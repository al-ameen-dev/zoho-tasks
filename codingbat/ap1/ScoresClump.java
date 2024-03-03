package ap1;

public class ScoresClump {
  public static boolean scoresClump(int[] scores) {
    int len = scores.length;
    if (len < 3)
      return false;

    for (int i = 0; i < len - 2; i++) {
      if (Math.abs(scores[i] - scores[i + 2]) <= 2)
        return true;
    }
    return false;
  }

}
