import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE,size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        size = sc.nextInt();
        array = new int[size];
        System.out.print("Enter the elements:");
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
            if(array[i] < min)
                min = array[i];
        }
        sc.close();
        System.out.printf("The smallest element in the array is:%d",min);
    }
}
