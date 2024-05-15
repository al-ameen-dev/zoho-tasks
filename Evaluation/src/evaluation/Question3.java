package evaluation;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		//int[] a = {9,2,8,1,3,5,6,7,3,1,1,6};
		//int[] b = {7,8,4,6,2,1,9,9,7};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number of digits length:");
		int firstSize = scanner.nextInt();
		System.out.print("Enter the second number of digits length:");
		int secondSize = scanner.nextInt();
		int[] a = new int[firstSize];
		int[] b = new int[secondSize];
		System.out.println("Enter the first digits one by one:");
		for(int i=0;i<firstSize;i++) {
			a[i] = scanner.nextInt(); 
		}
		System.out.println("Enter the second digits one by one:");
		for(int i=0;i<secondSize;i++) {
			b[i]= scanner.nextInt(); 
		}
		scanner.close();
		int arrSize = (firstSize>secondSize)?firstSize:secondSize;
		int[] result = new int[arrSize+1];
		int i = firstSize-1, j=secondSize-1;
		int resultIndex = result.length-1;
		int carry = 0;
		while(i>=0 && j>=0) {
			int val = a[i--]+b[j--]+carry;
			if(val>=10){
				result[resultIndex--] = val%10;
				carry = val/10;
			}else {
				result[resultIndex--] = val;
				carry = 0;
			}
		}
		while(i>=0) {
			int val = a[i--]+carry;
			if(val>=10){
				result[resultIndex--] = val%10;
				carry = val/10;
			}else {
				result[resultIndex--] = val;
				carry = 0;
			}
		}
		while(j>=0) {
			int val = b[i--]+carry;
			if(val>=10){
				result[resultIndex--] = val%10;
				carry = val/10;
			}else {
				result[resultIndex--] = val;
				carry = 0;
			}
		}
		System.out.println("The sum of the two number is :"+Arrays.toString(result));
	}
}
