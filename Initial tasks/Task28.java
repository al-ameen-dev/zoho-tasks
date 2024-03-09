import java.util.*;

public class Task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int number = sc.nextInt();
        sc.nextInt();
        sc.close();
        int sum = 0,total = 0;
        for(int i=0;i<number;i++)
        {
            sum += Math.pow(10,i);
            total += sum;
        } 

        System.out.println(total);
    }
}
