package march5tasks;
import java.util.Scanner;

public class IdenticalStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        sc.close();
        System.out.println(identical(str));
    }

public static String identical(String str)
{
    if(str.length()==0)
        return str;
    if(str.length()==2 && str.charAt(0)== str.charAt(str.length()-1))
        return str.charAt(0)+"*"+str.charAt(0);
    if(str.charAt(str.length()-2) == str.charAt(str.length()-1))
    {
        return identical(str.substring(0,str.length()-1))+"*"+str.charAt(str.length()-1);
    }
    return identical(str.substring(0,str.length()-1))+str.charAt(str.length()-1);
}
}