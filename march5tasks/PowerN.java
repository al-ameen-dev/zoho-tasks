package march5tasks;

import java.util.Scanner;
public class PowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        System.out.print("Enter the power:");
        int pow = sc.nextInt();
        sc.close();
        System.out.printf("powerN(%d,%d) ->%d",num,pow,powerN(num,pow));
    }

    public static int powerN(int num,int n)
    {
        if(n==1)
            return num;
        return num*powerN(num, n-1);
    }
}
