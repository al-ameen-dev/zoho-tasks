import java.util.*;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j>=temp)
                {
                    System.out.print(j+" ");
                    if(j==n)
                        for(int k=j-1;k>=temp;k--)
                            System.out.print(k+" ");
                }
                else
                    System.out.print("  ");
            }
            temp--;
            System.out.println();
        }
    }
}
