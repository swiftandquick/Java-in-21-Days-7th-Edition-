package d15p7;

import java.io.*;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class AllCaps {

	String sourceName; 
	
	public AllCaps(String sourceArg) {
		sourceName = sourceArg;
	}
	
	public void convert() {
		try {
			// Create the file objects.  
			FileSystem fs = FileSystems.getDefault();
			/* getPath's argument is relative path, so I have to get the path to 
			 * "src/d15p7/tempFile.txt" and src/d15p7/tmp_tempFile.txt.  
			 * tempFile.txt is where I write my lower case letters 
			 * in for experimental purposes. tmp_tempFile.txt is the file that will show 
			 * as the upper case counterpart of tempFile.txt.  */
			Path source = fs.getPath("src/d15p7/" + sourceName);			
			Path temp = fs.getPath("src/d15p7/" + "tmp_" + sourceName);
			
			// Create input stream.  Convert path to file.  
			FileReader fr = new FileReader(source.toFile());
			BufferedReader input = new BufferedReader(fr);
			
			// Create output stream.  Convert path to file.  
			FileWriter fw = new FileWriter(temp.toFile());;
			BufferedWriter output = new BufferedWriter(fw);
			
			/* End of file is initially false.  */
			boolean eof = false;
			
			/* The character is represented by the integer.  */
			int inChar; 
			
			/* At least iterate once.  */
			do {
				/* inChar use input stream to retrieve the next character.  
				 * Read character by character from tempFile.txt.  */
				inChar = input.read();
				if (inChar != -1) {
					/* Converts inChar from int to char, then convert it to uppcase
					 * The capitalized inChar will be stored as outChar.  */
					char outChar = Character.toUpperCase((char) inChar);
					/* Write upper case version of characters to tmp_tempFile.txt 
					 * until end of file is reached.   */
					output.write(outChar);
				}
				else {
					eof = true;
				}
			} while (!eof);
			
			// Close the streams.  
			input.close();
			output.close();
		}
		
		catch (IOException | SecurityException e) {
			System.out.println(e.toString());
		}
		
	}
	
}