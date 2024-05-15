package Assignment3ControlStatements;
import java.util.*;

/*
Write a program to print factorial of a given number using loop.
 */
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();
        sc.close();
        int factorial = 1;
        for(int i=1;i<=number;i++)
            factorial *= i;
        System.out.printf("The factorial is: %d",factorial);
    }   
}
