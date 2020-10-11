package d15p5;

import java.io.*;

/* Reads first 400 prime numbers to 400primes.dat.  
 * Compile this file last.  */
public class PrimeReader {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("src/d15p5/400primes.dat");
			BufferedInputStream buff = new BufferedInputStream(file);
			DataInputStream data = new DataInputStream(buff);
			
			try {
				/* Endless loop, but the loop will stop once an error is caught, by then, 
				the program exits out the try block, which contains the while loop.   */ 
				while (true) {
					/* Reads the next integer.  */
					int input = data.readInt();
					System.out.print(input + " ");
				}
			}
			/* Breaks out of the while loop once end of file is reached.  */
			catch (EOFException eof) {
				buff.close();
			}			
		}
		// If I can't retrieve the file, there will be IOException.  
		catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}
	
}
