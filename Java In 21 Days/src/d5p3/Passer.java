package d5p3;

/* Run -> Run Configuration.  
 * Set argument as "hello world".  */

public class Passer {

	void toUpperCase(String[] text) {
		for (int i = 0; i < text.length; i++) {
			text[i] = text[i].toUpperCase();
		}
	}
	
	public static void main(String[] args) {
		Passer passer = new Passer();
		
		/* toUpperCase is a method of the Passer class.  
		 * When passing arguments to methods, any change made to the object 
		 * inside the method persists outside the method.  */
		passer.toUpperCase(args);

		/* Notice how args[i] prints out HELLO WORLD rather than hello world.  */
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
	}
	
}
