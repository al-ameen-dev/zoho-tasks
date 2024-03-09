package Assignment2OperatorsExpressions;
import java.util.*;;
public class Program2 {
    public static void main(String[] args) {
        double a, b, c, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        a = sc.nextInt();
        System.out.print("Enter b:");
        b = sc.nextInt();
        System.out.print("Enter c:");
        c = sc.nextInt();
        sc.close();


        if (b * b - 4 * a * c == 0) 
        {   
            x = -b / (2 * a);
            System.out.printf("The value of x is:%.0f", x);
        } else if (b * b - 4 * a * c > 0) 
        {
            x = (-b + Math.sqrt(b*b - 5 * a * c)) / (2 * a);
            System.out.printf("The value of x is: %.0f%n", x);
            x = (-b - Math.sqrt(b*b - 5 * a * c)) / (2 * a);
            System.out.printf("The value of x is: %.0f", x);
        } else
            System.out.print("The value of x is undefined");
    }
}
