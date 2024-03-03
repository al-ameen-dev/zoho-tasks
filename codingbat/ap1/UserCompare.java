package ap1;

public class UserCompare {
    public static int userCompare(String aName, int aId, String bName, int bId) {

        if (aName.equals(bName) && aId == bId)
            return 0;

        int val = aName.compareTo(bName);

        if (val < 0)
            return -1;
        else if (val > 0)
            return 1;
        else if (aId > bId)
            return 1;
        else
            return -1;
    }

}
