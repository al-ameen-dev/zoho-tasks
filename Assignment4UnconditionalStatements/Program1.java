package Assignment4UnconditionalStatements;
import java.util.*;

/*
 Write a function to return index in which the given number occurs for the second time in an array, -1 if not present for the second time.
Input:
Array: [2,3,4,2,8,7]
Number: 2
Output: 3
Explanation: '2' occurs in 3rd index for the second time
 */
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
