package d15p10;

import java.io.*;
import java.nio.file.*;

public class AllZero {

	private String fileName;
	private int bytes = 0;
	
	public AllZero(String fileName) {
		this.fileName = fileName;
	}
	
	
	public void convert() {
		
		try {
			FileSystem fs = FileSystems.getDefault();
			Path source = fs.getPath("src/d15p10/" + fileName); // file.txt.  
			Path temp = fs.getPath("src/d15p10/new_" + fileName); // new_file.txt

			// Create input stream.  Convert path to file.  
			FileReader fr = new FileReader(source.toFile());
			BufferedReader input = new BufferedReader(fr);
			
			// Create output stream.  Convert path to file.  
			FileWriter fw = new FileWriter(temp.toFile());
			BufferedWriter output = new BufferedWriter(fw);
			
			boolean eof = false; // Initially false.  
			int inChar;  // int and char can be used interchangeably.  
			
			do {
				// Reads and retrieves the next character.  
				inChar = input.read();
				if (inChar != -1) {
					/* For every character that is read from file.txt, a '0' 
					is added onto new_file.txt.  */
					char outChar = '0';
					output.write(outChar);
					bytes++;  /* Increments bytes by 1 for every iteration.  */
				}
				else {
					eof = true; // If inChar is -1, which means end of file has been reached.  
				}
			} while (!eof);
			
			// Close the streams
			input.close();
			output.close();
		}
		
		catch (IOException | SecurityException e) {
			System.out.println(e.toString());
		}
		
		finally {
			System.out.printf("Size of file.txt is %d bytes.  ", bytes);
		}
		
	}
	
}