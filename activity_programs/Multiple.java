package activity_programs;
import java.util.*;
public class Multiple {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        if(num%5 == 0 && num%3==0)
            System.out.print("Three Five");
        else if(num%3==0)
            System.out.print("Three");
        else if(num%5 ==0)
            System.out.print("Five");
        else
            System.out.println();
    }
    
}
