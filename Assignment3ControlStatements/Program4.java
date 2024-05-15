package Assignment3ControlStatements;
import java.util.*;;

/*
Write a program to print multiplication table of a given number in a neat format.
 */
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();
        System.out.print("Enter the limit:");
        int limit = sc.nextInt();
        sc.close();
        for(int i=1;i<=limit;i++)
        {
            System.out.printf("%d * %d = %d%n",i,number,i*number);
        }
    }
}
