package d15p1;

import java.io.*;

/* Run this class, then right click on save.gif, save.gif also has 266 bytes.  */
public class ByteReader {

	public static void main(String[] args) {
		try {
			// Relative path starts at src folder.  
			FileInputStream file = new FileInputStream("src/d15p1/save.gif");
			
			/* Initially, eof is false because the program hasn't reach to end of file.  */
			boolean eof = false;
			
			int count = 0;
						
			/* While end of file isn't reached, eof remains as false.  */
			while (!eof) {
				/* Read, get, and print the next byte.  */
				int input = file.read();
				System.out.print(input + " ");
				/* If input is -1, which means end of filed is reached, set eof to true.  */
				if (input == -1) {
					eof = true;
				}
				else {
					/* Otherwise keep incrementing the count value.  */
					count++;
				}
			}
			/* Close the stream.  */
			file.close();
			System.out.println("\nBytes read:  " + count);
		}
		// There could be input output exception when loading a file.  
		catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	
}
