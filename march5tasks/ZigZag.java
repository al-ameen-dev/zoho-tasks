package march5tasks;
import java.util.*;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the string:");
        String str = sc.next();
        sc.close();
        String[] mat = new String[rows];
        for(int i=0;i<rows;i++)
            mat[i] = "";
        int r=0,i=0;
        while(r<str.length() &&  i<str.length())
        {
            for(int j=0;j<rows && i<str.length();j++)
                mat[j] += str.charAt(i++);
            for(int j=rows-2;j>=1 && i<str.length();j--)
                mat[j] += str.charAt(i++);
        }
        String zig ="";
        for(String s :mat)
            zig +=s;
        System.out.println(zig);
    }
}
