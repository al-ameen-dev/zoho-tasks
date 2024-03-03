import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int[] arr,altarray;
        int size,start = 0,end,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        size = sc.nextInt();
        arr = new int[size];
        altarray = new int[size];
        for(i=0;i<size;i++)
            arr[i] = sc.nextInt();
        sc.close();
        Arrays.sort(arr);
       
        end = size;
        i = 0;
        while(i<size)
        {
            if(i%2!=0)
            {
                altarray[i] = arr[start];
                start++;
            }
            else{
                end--;
                altarray[i] = arr[end]; 
            }
            i++;
        }
        System.out.println(Arrays.toString(altarray));
    }
}
