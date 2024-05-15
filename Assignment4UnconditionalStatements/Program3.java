package Assignment4UnconditionalStatements;
import java.util.*;;

/*
Write a program to find the sum of even numbers only in a given array. Use continue.
 */
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        int evenSum = 0;
        System.out.println("Enter the elements one by one:");
        for(int i=0;i<size;i++)
            array[i] = sc.nextInt();
        sc.close();
        for(int i=0;i<size;i++)
        {
            if(array[i] % 2==0)
                evenSum += array[i];
        }
        System.out.println("Sum of Even numbers:"+evenSum);
    }
}
