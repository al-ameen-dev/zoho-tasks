package com.alameendev.dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					swap(array, i, j);
				}
			}
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
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
