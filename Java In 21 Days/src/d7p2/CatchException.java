package d7p2;

public class CatchException {

	public static void main(String[] args) {
		
		int num = 5;
		
		/* Contains codes that may throw an except, num = num / 0 throws ArithmeticException.  */
		try {
			num = num / 0;
		}

		/* Creates an exception.  */
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.  ");
		}
		
	}
	
}
