import java.util.*;

public class Task27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.next();
        System.out.print("Enter the substring:");
        String substr = sc.next();
        sc.close();
        int strlen = str.length();
        int sublen = substr.length();
        for(int i=0;i<strlen-sublen;i++)
        {
            if(str.substring(i,i+sublen).equals(substr))
            {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
