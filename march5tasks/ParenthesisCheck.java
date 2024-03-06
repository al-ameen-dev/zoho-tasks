package march5tasks;
import java.util.Scanner;

public class ParenthesisCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression:");
        String exp = sc.next();
        sc.close();
        System.out.printf("%s ->%b",exp,checkParenthesis(exp));
    }

    public static boolean checkParenthesis(String str)
    {
        if(str.length()==0)
            return false;
        if(str.length() == 2 && str.charAt(0) == '(' && str.charAt(1) == ')')
            return true;
        if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
            return checkParenthesis(str.substring(1,str.length()-1));
        return false;
    }
}
