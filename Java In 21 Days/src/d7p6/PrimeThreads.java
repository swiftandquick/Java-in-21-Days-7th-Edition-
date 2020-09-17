package d7p6;

/* Run -> Run configuration, set arguments as "5000 12000 50000 120000 1dwa2 300000".  */

public class PrimeThreads {

	public static void main(String[] args) {
		/* Creates an anonymous object with instance of PrimeThread, passes args 
		 * as argument, args is a String array ["5000", "12000", "50000", 
		 * "120000", "1dwa2", "300000, "-5000""].  */
		new PrimeThreads(args);
	}
	
	/* A constructor that takes argument String array args.  */
	public PrimeThreads(String[] args) {
		
		/* Create the array of PrimeFinder object type called finder.  
		 * Set the array length to args.length, which is 6.  */
		PrimeFinder[] finder = new PrimeFinder[args.length];
		
		/* Iterates through every args element.  */
		for (int i = 0; i < args.length; i++) {
			try {
				/* Convert the current index in the args array from String to long.  
				 * args[0] = 5000.  */
				long count = Long.parseLong(args[i]);
				/* finder[i] is an PrimeFinder type object that's in the current index.  
				 * I use finder[i] to call the PrimeFinder constructor and passes in 
				 * current count as argument.  For example, finder[0] will pass 5000 
				 * as argument.  */
				finder[i] = new PrimeFinder(count);
				System.out.println("Looking for prime " + count);
			}
			/* If String cannot be converted to long, NumberFormatException will occur.  
			 * For example, "1dwa2" cannot be converted to number.  */
			catch (NumberFormatException nfe) {
				System.out.println("Error:  " + nfe.getMessage());
			}
		}
		
		/* Initially, the program hasn't complete the task of finding the nth prime.  */
		boolean complete = false;
		
		/* While complete is false...  */
		while (!complete) {
			/* Set complete to true.  */
			complete = true;
			/* Iterate through every finder index, from 0 to 5.  Note that the indices 
			 * runs at the same time, as evident that multiple the nth prime number 
			 * shows up at the same time.  That's the work of threads:  multitasking.  
			 * Display associated with last index shows up a bit later because it takes 
			 * a bit longer to find the 300000th prime number.  */
			for (int j = 0; j < finder.length; j++) {
				/* If finder[j] contains no value, skip the iteration.  */
				if (finder[j] == null) {
					continue;
				}
				/* If the current element of finder array has the finished value of false, 
				 * which means the program has yet to finish finding the nth prime, set 
				 * complete the false.  */
				if (!finder[j].finished) {
					complete = false;
				}
				/* Otherwise, if the current element of finder array has the finished value 
				 * of true, which means the program already finish finding the prime, let 
				 * complete value remain true.  */
				else {
					/* Call displayResult and passes in the current finder object as argument.  */
					displayResult(finder[j]);
					/* Set current finder index to null, this prevents the program from printing out 
					 * the result multiple times.  */
					finder[j] = null;
				}
			}
			/* For every iteration (while complete is false), the thread sleeps for 1 second.  There is 
			 * also a small pause between Prime 120000 and Prime 300000 display, because between them, 
			 * it's the String value of "1dwa2", which isn't a number, so finder[4] equals null, that 
			 * iteration is skipped.  */
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException ie) {
				// Do nothing.  
			}
		}
	}
	
	
	private void displayResult(PrimeFinder finder) {
		/* Because target and prime are public instance variables, they can be used here.  */
		System.out.println("Prime " + finder.target + " is "+ finder.prime);
	}
	
}
