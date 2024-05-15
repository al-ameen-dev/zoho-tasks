package exception;

/*
Write program to demonstrate ArrayIndexOutOfBoundsException.
 */
public class ArrayIndexOutofExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.print(args[0]);
		}catch(ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException("Command line input is empty!");
		}
	}
}
