package ap1;

public class ScoresAverage {
  public static int scoresAverage(int[] scores) {

    int mid = scores.length / 2;
    int first = average(scores, 0, mid);
    int second = average(scores, mid, scores.length);

    return (first < second ? second : first);
  }

  public static int average(int[] scores, int start, int end) {
    int count = 0;
    int sum = 0;
    for (int i = start; i < end; i++) {
      count++;
      sum += scores[i];
    }
    return sum / count;
  }

}
