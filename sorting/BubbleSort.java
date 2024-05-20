package com.alameendev.dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void sort(int[] array) {
		int n = array.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the array size:");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.print("Enter the number one by one:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		sort(array);
		System.out.println("Sorted Array:" + Arrays.toString(array));
	}
}
