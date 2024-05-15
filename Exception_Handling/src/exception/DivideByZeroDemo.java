package exception;

import java.util.Scanner;

/*
 Write a program for division with proper divide-by-zero exception handling.
 */
public class DivideByZeroDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number A:");
		int a = scanner.nextInt();
		System.out.print("Enter the number B:");
		int b = scanner.nextInt();
		scanner.close();
		try {
			System.out.printf("The value is:%.5f",a/b);
		}catch(ArithmeticException e) {
			System.out.print("Cannot divide by zero!");
		}
	}
}
