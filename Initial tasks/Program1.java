import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char c = sc.next().charAt(0);
        sc.close();
        for (int i = (int) c; i < 91; i++) {
            System.out.print((char) i);
        }
    }
}
