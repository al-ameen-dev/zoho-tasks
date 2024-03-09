import java.util.*;

public class Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int space=0;space<i;space++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++)
            {
                int val = n-i;
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
