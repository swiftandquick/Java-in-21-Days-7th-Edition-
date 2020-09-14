package d5p7;

class Printer {

	int x = 0;
	int y = 1;
	
	void printMe() {
		/* z variable cannot be printed, because z variable is an instance variable of 
		 * the subclass SubPrinter, so it's not defined in the superclass (here).  */
		System.out.println("x is " + x + ", y is " + y);
		System.out.println("I am an instance of the class " + this.getClass().getName());
	}
	
}