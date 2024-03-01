package logic1;

public class CigarParty {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars > 39 && isWeekend)
            return true;
        else if (cigars > 39 && cigars < 61) {
            return true;
        } else
            return false;
    }

}
