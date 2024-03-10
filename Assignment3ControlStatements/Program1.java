package Assignment3ControlStatements;
import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();
        sc.close();
        if(a>b && a>c)
            System.out.println("a is the biggest "+a);
        else if(b>c)
        {   
            System.out.println("b is the biggest "+b);
        }else
            System.out.println("c Is the biggest "+c);
    }
}
