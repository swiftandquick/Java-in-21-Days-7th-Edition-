package d5p7;

class SubPrinter extends Printer {
	int z = 3;
	
	/* Subclass method printMe() overrides the superclass' printMe() method.  
	 * z is defined in this class so it can be printed.  */
	void printMe() {
		System.out.println("x is " + x + ", y is " + y + ", z is " + z);
		System.out.println("I am an instance of the class " + this.getClass().getName());
	}
	
	public static void main(String[] args) {
		SubPrinter obj = new SubPrinter();
		obj.printMe();
	}
	
}