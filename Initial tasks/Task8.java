import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character to find ASCII value:");
        ch = sc.next().charAt(0);
        sc.close();
        System.out.printf("The ASCII value of '%c' is %d",ch,(int)ch);
    }
}
