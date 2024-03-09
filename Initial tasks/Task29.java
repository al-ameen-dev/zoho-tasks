import java.util.*;

public class Task29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=number;j++)
            {
                if(i==1 || j==1 || i==number)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
