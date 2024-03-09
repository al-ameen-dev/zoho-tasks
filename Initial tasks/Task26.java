import java.util.*;
public class Task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n+n;j++)
            {
                if(i==0 || j < n-i || j >=n+i)
                    System.out.print("*");
                else
                    System.out.print("_");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=n+n;j>0;j--)
            {
                if(j==1 || j > (n+i)-1 || j <=(n-i)+1)
                    System.out.print("*");
                else
                    System.out.print("_");
            }
            System.out.println();
        }
    }
}
