package recursion1;

public class ParentBit {
    public static String parenBit(String str) {
        char fChar = str.charAt(0);
        char lChar = str.charAt(str.length() - 1);

        if (fChar == '(' && lChar == ')')
            return str;
        else if (fChar == '(' && lChar != ')')
            return parenBit(str.substring(0, str.length() - 1));
        else if (fChar != '(' && lChar == ')')
            return parenBit(str.substring(1, str.length()));

        return parenBit(str.substring(1, str.length() - 1));
    }

}
