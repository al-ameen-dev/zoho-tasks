package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Create a program to get phone number from the user and throw InputMismatchException if the user enters non-number input.
 */
public class InputMismatchExceptionDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the phone number:");
		try {
			long phoneNumber = scanner.nextLong();
			System.out.println("The phone number is:"+phoneNumber);
		}catch(InputMismatchException e) {
			System.out.println("This is number input mismatch exception throwed!");
			throw new InputMismatchException("This input mismatch exception is throwned by me!");
		}
		scanner.close();
	}
}
