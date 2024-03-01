package string3;

public class CountYZ {
    public static int countYZ(String str) {
        int len = str.length();

        if (len < 1)
            return 0;
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            if ((Character.toLowerCase(str.charAt(i)) == 'z' || Character.toLowerCase(str.charAt(i)) == 'y')
                    && !Character.isLetter(str.charAt(i + 1)))
                count++;
        }
        if (Character.toLowerCase(str.charAt(len - 1)) == 'z' || Character.toLowerCase(str.charAt(len - 1)) == 'y')
            count++;
        return count;
    }

}
