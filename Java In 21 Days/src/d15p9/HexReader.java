package d15p9;

import java.io.*;

public class HexReader {

	public void readFile() {
		try {
			// BufferedReader contains anonymous FileReader object.  
			BufferedReader buff = new BufferedReader(new FileReader("src/d15p9/hexfile.txt"));
			String line;
			/* Initialize line to read the first line.  While loop continues to iterate 
			 * until there is no more lines to read.  */
			while ((line = buff.readLine()) != null) {
				/* I can call this method readLine(), readLine() is a method of the BufferedReader 
				 * class.  So I called this method readTheLine() instead.   */
				readTheLine(line);
			}
		}
		catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}
	
	
	/* Since there are 3 lines, readTheLine will iterate 3 times.  */
	public void readTheLine(String code) {
		try {
			/* For each iteration, pick the next two characters as substring.  For example, in the 
			 * String "000A110D1D260219", the first two characters are "00", then those two numbers 
			 * will be "chosen", after "00" is converted, the program picks "0A" to convert.   */
			for  (int i = 0; i + 1 < code.length(); i += 2) {
				String sub = code.substring(i, i + 2);
				/* Convert from String to integer.  */
				int num = Integer.parseInt(sub, 16);
				System.out.print(num + "\t");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		HexReader app = new HexReader();
		app.readFile();
	}
	
}
