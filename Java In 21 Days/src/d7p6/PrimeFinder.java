package d7p6;

/* Implementing Runnable interface generates the run() method. */
public class PrimeFinder implements Runnable {

	public long target; // nth prime.  
	public long prime; // The value of the nth prime number.  
	/* Initialize the finished value as false.  */
	public boolean finished = false;
	private Thread runner;
	

	/* The constructor takes in a target.  */
	PrimeFinder(long inTarget) {
		try {
			/* Throws NegativeNumberException if target is negative.  */
			if (inTarget < 0) {
				throw new NegativeNumberException();
			}
			target = inTarget;
			/* Run the thread if it's currently null.  start() calls the run() method.  
			 * Multiple indices from the finder array call start() at the same time.  */
			if (runner == null) {
				runner = new Thread(this);
				runner.start();
			}
		}
		catch (NegativeNumberException nne) {
			System.out.println("Target is a negative number.  ");
		}
	}
	
	
	/* Call by the start() method.  */
	public void run() {
		/* For each number, numPrimes is initially 0.  */
		long numPrimes = 0;
		/* The first prime number is 2.  */
		long candidate = 2;
		/* While the number of primes is less than the target number of primes.  
		 * ITerate the while loop until the right number of prime numbers is found.  */
		while (numPrimes < target) {
			if (isPrime(candidate)) {
				/* Call the isPrime method and pass in the current candidate value, 
				 * if isPrime() returns true, set prime equal to current candidate.  
				 * For example, the args[0] is 5000, that means target is 5000.  This 
				 * means candidate value will update 5000 times.  */
				numPrimes++;
				prime = candidate;
			}
			/* Increment candidate by 1 for every while loop iteration.  */
			candidate++;
		}
		/* After the while loop ends, set finished to true.  */
		finished = true;
	} // End of run() method, when thread no longer does any work.  
	
	
	
	boolean isPrime(long checkNumber) {
		double root = Math.sqrt(checkNumber); 
		/* Iterate through 2 to sqrt(checkNumber), if checkNumber can be divide by any 
		 * numbers between any numbers between 2 and sqrt(checkNumber), then return 
		 * false since it's not a prime number.  If checkNumber is not divisible by 
		 * any numbers between 2 to sqrt(checkNumber), then return true.  */
		for (int i = 2; i <= root; i++) {
			if (checkNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
