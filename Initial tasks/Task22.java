import java.util.*;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int space=0;space<i;space++)
                System.out.print(" ");
            for(int j=0;j<n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
