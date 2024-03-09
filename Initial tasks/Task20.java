import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        int temp=1;
        for(int i=1;i<=n;i++)
        {
            for(int space=0;space<n-i;space++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
                if(j==temp)
                {
                    for(int k=j-1;k>=1;k--)
                        System.out.print(k+" ");
                }
            }
            
            temp++;
            System.out.println();
        }
    }
}
