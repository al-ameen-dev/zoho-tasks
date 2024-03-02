import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character to check:");
        char ch = sc.next().charAt(0);
        sc.close();
        if((ch >= 65 && ch <=90) || (ch >= 97 && ch <= 122))
            System.out.printf("The character '%c' is a Alphabet",ch);
        else
            System.out.printf("The character '%c' is not a Alphabet",ch);
    }
}
