package d7p7;

/* Run -> Run Configuration.  
 * Set argument as "1 6 4 9 41 56 z7 41 h3 13" */

public class AverageValue {

	public static void main(String[] args) {
		float[] temps = new float[10];
		float sum = 0;
		int count = 0;
		int i;
		/* There is nothing wrong with this line, but why bother to set 
		 * i < args.length and i < 10 at the same time?  */
		for (i = 0; i < args.length && i < 10; i++) {
			try {
				temps[i] = Float.parseFloat(args[i]);
				/* Increment the amount of number by 1 every time the temp[i] 
				 * can be change to float type.  count should be 8 at the end.  */
				count++;
			}
			/* If I can't change String to float, then NumberFormatException occurs, 
			 * this catch block will catch the error.  */
			catch (NumberFormatException nfe) {
				System.out.println("Invalid input:  " + args[i]);
			}
			/* Add all the valid temps elements together to sum.  */
			sum += temps[i];
		}
		System.out.println("Average:  " + (sum / count));
	}
	
}
