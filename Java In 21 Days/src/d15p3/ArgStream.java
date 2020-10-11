package d15p3;

import java.io.*;

public class ArgStream {

	/* Initial values of the instance variables.  */
	int start = 0;
	int finish = 255;
	
	
	/* After constructor is called, variable may be changed.  */
	ArgStream(int st, int fin) {
		start = st;
		finish = fin;
	}
	
	
	/* Changed method to void because it gives me too many errors as Boolean.  */
	void writeStream() {
		try {
			// Create a buffered output stream.  
			FileOutputStream file = new FileOutputStream("src/d15p3/numbers.dat");
			BufferedOutputStream buff = new BufferedOutputStream(file);
			
			/* Writes number from start to finish.  */
			for (int output = start; output <= finish; output++) {
				buff.write(output);
				System.out.print(output + " ");
			}
			buff.close();
		}
		catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		// If I don't add this line, there will be error.  
	}
	
	
	void readStream() {
		try {
			// Create a buffered input stream.  
			FileInputStream file = new FileInputStream("src/d15p3/numbers.dat");
			BufferedInputStream buff = new BufferedInputStream(file);
			int input;
			do {
				// Reads and retrieves the next byte.  
				input = buff.read();
				// If input is not -1, means end of file hasn't been reached yet.  
				if (input != -1) {
					System.out.print(input + " ");
				} 
			} while (input != -1);
			System.out.println();
			buff.close();
		}
		catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} 
	}

	
}