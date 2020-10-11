package d15p8;

import java.io.*;

public class Unknown {

	/* The program can successfully compile, because input stream that's represented by 
	 * System.in can be used just like any other input stream.  */
	
	public static void main(String[] args) {
		String command = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			command = br.readLine();
		}
		catch (IOException e) {
			// Nothing.  
		}
	}
	
}
