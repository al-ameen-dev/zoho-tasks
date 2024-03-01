package logic1;

public class AnswerCall {
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isMorning && !isMom && !isAsleep) {
            return true;
        } else if ((!isMorning && !isMom) || isAsleep) {
            return false;
        } else if ((isMorning && isMom) || (!isMorning && isMom && !isAsleep)) {
            return true;
        } else
            return false;
    }

}
