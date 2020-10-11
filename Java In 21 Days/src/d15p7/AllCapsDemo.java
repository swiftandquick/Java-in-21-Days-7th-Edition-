package d15p7;

/* Run -> Run Configuration -> Arguments, 
 * Set tempFile.txt as argument.  */
public class AllCapsDemo {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("You must specify a file name");
			System.exit(-1);
		}
		/* Creates an all caps object, pass "allcaps.txt as argument.  */
		AllCaps cap = new AllCaps(args[0]);
		// Use the cap object to call the convert() method.  
		cap.convert();
	}
	
}