package logic1;

public class AlarmClock {
    public static String alarmClock(int day, boolean vacation) {
        if ((day > 0 && day < 6) && !vacation)
            return "7:00";
        else if ((day > 0 && day < 6) && vacation)
            return "10:00";
        else if ((day == 0 || day == 6) && vacation)
            return "off";
        else
            return "10:00";
    }

}
