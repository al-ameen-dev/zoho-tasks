import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int num, reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = sc.nextInt();
        sc.close();
        while(num>0)
        {
            reverse = reverse * 10 +num%10;
            num = num/10;
        }
        System.out.printf("The number in reverse order is: %d",reverse);
    }
}
