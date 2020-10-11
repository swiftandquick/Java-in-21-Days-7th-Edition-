package d15p6;

import java.io.*;

public class SourceReader {

	public static void main(String[] args) {
		
		try {
			// Reads this file.  
			FileReader file = new FileReader("src/d15p6/SourceReader.java");
			BufferedReader buff = new BufferedReader(file);

			boolean eof = false;
			
			// While end of file hasn't been reached, eof stays false.  
			while (!eof) {
				String line = buff.readLine();
				// If there is no more line to read, readLine() will return null.
				if (line == null) {
					// If there is no more line to read, set eof to true.  
					eof = true;
				}
				else {
					System.out.println(line);
				}
			}
			buff.close();
		}
		catch(IOException ioe) {
			System.out.println(ioe.toString());
		}
	}
	
}
