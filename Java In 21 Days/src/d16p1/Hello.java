package d16p1;

public class Hello {

	class InnerHello {
		/* Constructor, invoke by the program object.  */
		InnerHello() {
			System.out.println("The method call is coming from inside the class!  ");
		}
	}
	
	
	public Hello() {
		// Empty constructor.  
	}
	
	
	public static void main(String[] args) {
		/* Creates a program object with instance of Hello class.  */
		Hello program = new Hello();
		/* Use program (Hello) to create an anonymous InnerHello object, 
		 * which means it invokes the constructor of the InnerHello class.  */
		program.new InnerHello();
		
		/* Creating an object of an inner class requires an object of an outer class.  */
		Hello.InnerHello inner = program.new InnerHello();
	}
	
}
