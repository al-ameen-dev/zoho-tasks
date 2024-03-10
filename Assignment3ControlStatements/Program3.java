package Assignment3ControlStatements;
import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks:");
        int mark = sc.nextInt();
        sc.close();
        if(mark < 0 && mark >100)
            System.out.println("Enter a valid mark!");
        else if(mark < 60)
            System.out.println("The Grade is 'F'");
        else if(mark > 59 && mark <70)
            System.out.println("The Grade is 'D'");
        else if(mark > 69 && mark <80)
            System.out.println("The Grade is 'C");
        else if(mark > 79 && mark <90)
            System.out.println("The Grade is B");
        else
            System.out.println("The Grade is 'A'");
    }
}
