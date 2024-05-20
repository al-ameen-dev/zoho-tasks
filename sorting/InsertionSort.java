package com.alameendev.dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the array size:");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.print("Enter the elements one by one:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		sort(array);
		System.out.println("Sorted Array:" + Arrays.toString(array));
	}
}
