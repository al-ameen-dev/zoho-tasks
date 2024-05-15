package exception;

/*
. Create a custom Exception by yourself and try throwing and catching the same.
 */

class MyOwnException extends Exception{
	
	public MyOwnException(String message) {
		super(message);
	}
}
public class CustomExceptionDemo {
	public static void main(String[] args) {
		try {
			throw new MyOwnException("This is  My  Own Exception used for testing purpose!");
		}catch(MyOwnException e) {
			e.printStackTrace();
		}
	}
}
