package d15p3;

/* Go to Run, then Run Configuration, go to arguments, 
 * set the arguments as "3 19".  */

public class BufferDemo {

	public static void main(String[] args) {
		int start = 0; // First ASCII value.  
		int finish = 255; // Last ASCII value.  
		if (args.length > 1) {
			// Change start to 3.  
			start = Integer.parseInt(args[0]); 
			System.out.println(start);
			// Change finish to 19.  
			finish = Integer.parseInt(args[1]);
			System.out.println(finish);
		}
		/* If there is only one element in args array, finish variable is 
		 * unchanged (255) but only the start variable changes.  */
		else if (args.length > 0) {
			start = Integer.parseInt(args[0]);
		}
		ArgStream as = new ArgStream(start, finish);
		System.out.println("\nWriting:  ");
		as.writeStream();
		System.out.println("\nReading:  ");
		as.readStream();
	}
	
}
