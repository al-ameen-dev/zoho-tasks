package recursion1;

public class NestParen {
    public static boolean nestParen(String str) {

        if (str.length() == 0)
            return true;
        char fChar = str.charAt(0);
        char lChar = str.charAt(str.length() - 1);
        if (str.length() == 2 && fChar == '(' && lChar == ')')
            return true;
        else if (str.length() == 2 && fChar != '(' || lChar != ')')
            return false;

        if (fChar == '(' && lChar == ')')
            return nestParen(str.substring(1, str.length() - 1));
        else if ((fChar != '(' && lChar == ')') || (fChar == '(' && lChar != ')'))
            return false;

        return true;
    }

}
