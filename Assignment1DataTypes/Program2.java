package Assignment1DataTypes;
import java.util.*;

public class Program2 {
    enum DAYS
    {
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DAYS[] day = DAYS.values();
        System.out.print("Enter the number to get the day:");
        int d = sc.nextInt();
        sc.close();
        if(d>7)
            System.out.println("Enter a valid weekday number!");
        else
            System.out.println(day[d-1]);
    }
}
