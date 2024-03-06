package march5tasks;

import java.util.Scanner;

public class ParentBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.next();
        sc.close();
        System.out.printf("%s ->%s",str,parentBit(str));
    }

    public static String parentBit(String str)
    {
        if(str.length() == 2 && str.charAt(0) =='(' && str.charAt(1) == ')')
            return str;
        if(str.charAt(0) == '(' && str.charAt(str.length()-1)== ')')
            return str;
        else if(str.charAt(0) == '(' && str.charAt(str.length()-1) != ')')
            return parentBit(str.substring(0,str.length()-1));
        else if(str.charAt(0)!= '(' && str.charAt(str.length()-1)==')')
            return parentBit(str.substring(1,str.length()));
        else
            return parentBit(str.substring(1,str.length()-1));

    }
}
