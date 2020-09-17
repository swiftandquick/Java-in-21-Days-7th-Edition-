package d7p4a;

import java.io.IOException;

/* SubClass inherits SuperClass.  */
class SubClass extends SuperClass {

	/* IOException is a type of checked exception, it's thrown in SubClass.  
	 * IOException is the type of checked exception, so compiler will give error.  */
	// void method() throws IOException {
	
	/* ArithmeticException is a type of unchecked exception, it's thrown in SubClass.  
	 * IOException is the type of unchecked exception, so compiler will run .  */
	void method() throws ArithmeticException {
		System.out.println("SubClass");
	}
	
	public static void main(String[] args) {
		SuperClass s = new SubClass();
		s.method();
	}
	
}
