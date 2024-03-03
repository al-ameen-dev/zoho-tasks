import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task15 {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Set<Integer> dupList = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        size = sc.nextInt();
        arr = new int[size];
        System.out.print("Enter the elements:");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        sc.close();
        Arrays.sort(arr);
        for(int i=0;i<size-1;i++)
        {
            if(arr[i] == arr[i+1])
                dupList.add(arr[i]);
        }
        System.out.println(Arrays.toString(dupList.toArray()));
    }
}
