import java.util.Arrays;
import java.util.Scanner;

public class Task18 {
    
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements one by one:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=1;i<size;i++)
        {
            for(int j=i+2;j<size;j+=2)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<size;i+=2)
        {
            for(int j=i+2;j<size;j+=2)
            {
                if(arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
