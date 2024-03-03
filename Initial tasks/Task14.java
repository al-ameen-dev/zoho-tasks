import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int size = 0;
        int[] original,duplicate;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        size = sc.nextInt();
        original = new int[size];
        duplicate = new int[size];
        System.out.print("Enter the elements:");
        for(int i = 0;i<size;i++)
        {
            original[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<size;i++)
        {
            duplicate[i] = original[i];
        }
        // We can also use array clone() method to copy the array.
        // Array.copyOf() static method is used to copy the array.
        System.out.println("The copied array is:"+Arrays.toString(duplicate));
    }
}
