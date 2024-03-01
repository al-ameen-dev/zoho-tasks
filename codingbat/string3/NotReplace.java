package string3;

public class NotReplace {
    public static String notReplace(String str) {
        int len = str.length();
        String result = "";

        if (str.equals("is"))
            return "is not";

        int i = 0;

        if (len >= 3 && str.substring(0, 2).equals("is") && !Character.isLetter(str.charAt(2))) {
            result += "is not";
            i = 2;
        }

        while (i < len) {
            if (!Character.isLetter(str.charAt(i))) {
                result += str.charAt(i);
                i++;
            } else if (i >= 1 && i <= len - 3 &&
                    !Character.isLetter(str.charAt(i - 1)) &&
                    str.substring(i, i + 2).equals("is") &&
                    !Character.isLetter(str.charAt(i + 2))) {
                result += "is not";
                i += 2;
            } else if (i >= 1 && !Character.isLetter(str.charAt(i - 1)) &&
                    str.substring(i).equals("is")) {
                result += "is not";
                i += 2;
            } else {
                result += str.charAt(i);
                i++;
            }
        }

        return result;
    }

}
