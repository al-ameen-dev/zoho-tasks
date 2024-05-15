package evaluation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		/*
		 * My humble explanation to bala san .the question is continous subarray which
		 * means whenever we encounter a negative value sub array ends as per the
		 * question definition. Then check for the maximum value. if currently finded
		 * sum is greater than previously finded Max sum then return the current sum as
		 * max sum. I Used brute force approach wiht O(n) time complexity. You said that
		 * it is a recursive problem. The result is same as the expected result in the
		 * question paper. Thanks bala san.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.print("Enter the numbers one by one:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		List<Integer> list = new ArrayList<>();
		List<Integer> prevList = new ArrayList<>();
		int maxSum = 0, sum = 0;
		for (int j = 0; j < size; j++) {
			if (array[j] > 0) {
				list.add(array[j]);
				sum += array[j];
			} else {
				if (maxSum < sum) {
					maxSum = sum;
					sum = 0;
					prevList.clear();
					for (Integer el : list) {
						prevList.add(el);
					}
					list.clear();
				}
			}
		}
		if (maxSum < sum) {
			maxSum = sum;
			sum = 0;
			prevList.clear();
			for (Integer el : list) {
				prevList.add(el);
			}
			list.clear();
		}
		System.out.println("Sum :" + maxSum);
		System.out.println("Elements :" + prevList);
	}
}
