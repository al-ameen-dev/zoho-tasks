package march5tasks;

import java.util.Scanner;

public class JumbledNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        sc.close();
        boolean flag = true;
        int prenum = num%10, original = num;
        num /=10;
        while(num>0)
        {
            int temp = num % 10;
            int diff = Math.abs(prenum-temp);
            if(diff > 0 && diff < 2)
            {
                prenum = temp;
                num /= 10;
            }
            else
            {
                flag = false;
                num /= 10;
            } 

        }
        if(flag)
            System.out.printf("%d is a jumbled number",original);
        else
            System.out.printf("%d is not a jumbled number",original);
    }
   
    
}
