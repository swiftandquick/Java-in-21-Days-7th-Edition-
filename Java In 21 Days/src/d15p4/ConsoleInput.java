package d15p4;

import java.io.*;

public class ConsoleInput {

	/* Since I am using an anonymous object to call readLine() from a static method 
	 * (main method), readLine() is also static.  */
	public static String readLine() {
		// Create a StringBuilder.  
		StringBuilder response = new StringBuilder();
		
		try {
			/* Buffered input stream that is associated with the System.in input stream.  
			 * I will be asked to enter anything after "What is your name?  " is printed
			 * on the console.  */
			BufferedInputStream buff = new BufferedInputStream(System.in);
			// I called it input instead of in, because in is a variable from the System class.  
			int input; 
			char inChar;
			do {
				/* input is the next byte of what I entered in the console.  If there is 
				 * no more byte to retrieve from, then input will be -1.  */
				input = buff.read();
				/* inChar is the char version of input (int variable).  */
				inChar = (char) input;
				/* If the file hasn't reach to the end (input != -1), 
				 * if the current character is not a line skip (inChar != '\n'), 
				 * and if the current input is not a carriage return.  Append the current char 
				 * (inChar) to the response variable, which is a StringBuilder.  */
				if ((input != -1) && (inChar != '\n') && (input != '\r')) {
					response.append(inChar);
				}
			} while ((input != -1) && (inChar != '\n') && (input != '\r'));
			/* Close the BufferedInputStream.  */
			buff.close();
			/* Convert the StringBuilder to a regular String.  */
			return response.toString();
		}
		/* Returns nothing if IOException is caught.  */
		catch (IOException ioe) {
			System.out.println(ioe.getMessage());
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("\nWhat is your name?  ");
		/* Anonymous ConsoleInput object invokes readLine() method.  Then, readLine() 
		 * returns a String value, the returned value will be stored in the String input.  */
		String input = ConsoleInput.readLine();
		System.out.println("\nHello, " + input + ".  ");
	}
	
}
