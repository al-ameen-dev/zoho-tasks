package Assignment4UnconditionalStatements;
import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements one by one:");
        for(int i=0;i<size;i++)
            array[i] = sc.nextInt();
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        sc.close();
        int count = 0;
        for(int i=0;i<size;i++)
        {
            if(num == array[i])
                count++;
            if(count == 2)
            {
                System.out.println(i);
                break;
            }
        }
        if(count >0 && count <2)
            System.out.println(-1);
    }
}
