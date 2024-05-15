package Assignment2OperatorsExpressions;
import java.util.*;

/*
Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.
 */
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Bitwise AND a & b is "+(a&b));
        System.out.println("Bitwise OR a | b is "+(a|b));
        System.out.println("Bitwise XOR a ^ b is "+(a^b));
        System.out.println("Right shift a << b is "+(a<<b));
        System.out.println("Right shift a >> b is "+(a>>b));
    }
}
