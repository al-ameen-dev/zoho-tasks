import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check:");
        int num = sc.nextInt();
        sc.close();
        if ((num & 1) == 1)
            System.out.println("Odd Number");
        else
            System.out.println("Even Number");
    }
}
