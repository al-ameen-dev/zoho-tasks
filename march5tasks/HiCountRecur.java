package march5tasks;
import java.util.Scanner;

public class HiCountRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        sc.close();
        System.out.printf("(%s)->%d%n",str,hiCount(str));
    }

    public static int hiCount(String str)
    {
        if(str.length()<2)
            return 0;
        if(str.substring(str.length()-2,str.length()).equals("hi"))
            return 1+hiCount(str.substring(0,str.length()-2));
        return hiCount(str.substring(0,str.length()-1));
    }
}
