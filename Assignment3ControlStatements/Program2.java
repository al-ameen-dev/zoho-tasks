package Assignment3ControlStatements;
import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year:");
        int year = sc.nextInt();
        System.out.print("Enter the month:");
        int month = sc.nextInt();
        sc.close();
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
            month == 10 || month == 12)
        {
            System.out.printf("%d Days",31);
        }
        else if( month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.printf("%d Days",30);
        }
        else if(month == 2)
        {
            if(year%4==0 || (year % 100 == 0 && year % 400 == 0))
                System.out.printf("%d Days",29);
            else    
                System.out.printf("%d Days",28);
        }
    }
}
