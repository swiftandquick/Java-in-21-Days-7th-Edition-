package d7p4b;

import java.io.IOException;

public class SubClass extends SuperClass {

	/* Exception is not a subclass of RuntimeException, 
	 * so there will be a compiler error.  */
	// void method() throws Exception {
	
	/* ArithmeticException is the subclass of RuntimeException, 
	 * so the compiler will not give an error.  */
	// void method() throws ArithmeticException {
	
	/* There is no throw clause in the subclass method because 
	 * subclass inherits throws clause from the superclass.  */
	void method() {
		System.out.println("SubClass");
	}
	
	public static void main(String args[]) {
		SuperClass s = new SubClass();
		try {
			s.method();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/* Link:  https://www.geeksforgeeks.org/exception-handling-with-method-overriding-in-java/  */
	
}
