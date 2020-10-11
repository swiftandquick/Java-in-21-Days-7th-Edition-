package d15p5;

import java.io.*;

/* Writes first 400 prime numbers to 400primes.dat.  
 * Compile this file first.  */
public class PrimeWriter {

	
	// Checks if the candidate is a prime.  
	public static boolean isPrime(int checkNumber) {
		/* If the candidate is not divisible by by numbers below its square root value. 
		Then, that candidate is a prime number.  */
		double root = Math.sqrt(checkNumber);
		for (int i = 2; i <= root; i++) {
			if (checkNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		/* Used to store 400 prime numbers.  */
		int[] primes = new int[400];
		// Initially, number of primes is 0.  
		int numPrimes = 0;
		// First prime is 2.  
		int candidate = 2;
		/* Sets numPrimes from index 0 to index 399.  */
		while (numPrimes < 400) {
			/* If the current candidate is a prime number, set current index of isPrime 
			 * to the candidate, then increment the index (numPrimes).  */
			if (isPrime(candidate)) {
				primes[numPrimes] = candidate;
				numPrimes++;
			}
			/* Increments candidate every iteration.  */
			candidate++;
		}
		
		
		try {
			// Write the file called "400primes.dat" in the same package.  
			/*
			 * 1.  A file output stream associated with a file called 400primes.dat is created.  
			 * 2.  A new buffered output stream is associated with the file stream.  
			 * 3.  A new data output stream is associated with the buffered stream.  
			 */
			FileOutputStream file = new FileOutputStream("src/d15p5/400primes.dat");
			BufferedOutputStream buff = new BufferedOutputStream(file);
			DataOutputStream data = new DataOutputStream(buff);
			
			/* Use writeInt(int) to write integer to write all prime numbers found 
			 * in the primes array.  */
			for (int i = 0; i < 400; i++) {
				data.writeInt(primes[i]);
			}
			// Close the stream.  
			data.close(); 
		}
		catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}
	
}
