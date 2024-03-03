package ap1;

public class Scores100 {
    public static boolean scores100(int[] scores) {
        int len = scores.length;

        for (int i = 0; i < len - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100)
                return true;
        }
        return false;
    }

}
