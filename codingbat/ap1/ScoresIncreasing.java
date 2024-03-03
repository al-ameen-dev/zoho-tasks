package ap1;

public class ScoresIncreasing {
    public static boolean scoresIncreasing(int[] scores) {
        int len = scores.length;

        for (int i = 1; i < len; i++) {
            if (scores[i - 1] > scores[i])
                return false;
        }
        return true;
    }

}
