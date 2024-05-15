package evaluation;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the character:");
		char c = scanner.next().charAt(0);
		scanner.close();
		int limit = c - 'A';
		int alpha = 'A';
		for (int i = 0; i <= limit; i++) {
			for (int j = 0; j <= limit * 2; j++) {
				if(j==limit-i || j== limit+i) {
					System.out.print((char) alpha);
				}else {
					System.out.print(" ");
				}
			}
			alpha++;
			System.out.println();
		}
		alpha--;
		for (int i = limit; i>=0; i--) {
			for (int j = limit * 2; j >= 0; j--) {
				if(j==limit-i || j== limit+i) {
					System.out.print((char) alpha);
				}else {
					System.out.print(" ");
				}
			}
			alpha--;
			System.out.println();
		}
	}
}
