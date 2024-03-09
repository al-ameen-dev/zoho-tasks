package Assignment1DataTypes;
import java.util.*;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        sc.close();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.printf("After swapping a=%d b=%d",a,b);
    }
}
