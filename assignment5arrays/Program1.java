package assignment5arrays;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements one by one:");
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of positions you want to right rotate:");
        int positions = scanner.nextInt();
        scanner.close();
        System.out.println("Array Before Rotation:");
        printArray(array);
        array = rotateRight(array,positions);
        System.out.println("Array After Rotation:");
        printArray(array);

    }

    public static int[] rotateRight(int[] array,int positions){
        int[] arr = new int[array.length];
        for(int i=0;i<array.length;i++){
            int j= i+positions;
            j = j%array.length;
            arr[j] = array[i];
        }
        return arr;
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
