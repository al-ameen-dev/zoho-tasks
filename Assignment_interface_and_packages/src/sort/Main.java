package sort;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Define an interface named Sortable with a method sort() .
Implement this interface in classes representing different sorting algorithms such as bubble sort, quicksort, and merge sort.
Allow the user to input an array, select a sorting algorithm, and display the sorted array.
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sortable sort;
		int[] arr = null;
		int size;
		exit: while (true) {
			System.out.println("Choices 1:Enter the array 2:Quick Sort 3:Bubble sort 4:Merge sort 5:Exit:");
			System.out.print("Enter the choice:");
			try {
				int choice = scanner.nextInt();
				switch (choice) {
				case 1: {
					System.out.print("Enter the array size:");
					size = scanner.nextInt();
					arr = new int[size];
					System.out.print("Enter the elements one by one:");
					for (int i = 0; i < size; i++) {
						arr[i] = scanner.nextInt();
					}
					break;
				}
				case 2: {
					sort = new QuickSort();
					sort.sort(arr);
					System.out.println(Arrays.toString(arr));
					break;
				}
				case 3: {
					sort = new BubbleSort();
					sort.sort(arr);
					System.out.println(Arrays.toString(arr));
					break;
				}
				case 4:{
					sort = new MergeSort();
					sort.sort(arr);
					System.out.println(Arrays.toString(arr));
					break;
				}
				case 5:{
					break exit;
				}
				}

			} catch (InputMismatchException e) {
				System.out.println("Enter a number input!");
			}

		}
	}
}
