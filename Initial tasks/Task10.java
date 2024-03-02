import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        s = sc.nextLine();
        sc.close();
        System.out.println(recurReverse(s));
    }

    public static String recurReverse(String str)
    {
        int index = str.indexOf(" ");
        if(index == -1)
            return str;
        return recurReverse(str.substring(index+1,str.length()))+" "+str.substring(0,index);
    }
}
