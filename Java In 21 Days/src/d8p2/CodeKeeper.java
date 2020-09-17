package d8p2;

import java.util.*;

/* Run -> Run Configuration.  
 * Put argument as "alpha lambda beta epsilon".  */
public class CodeKeeper {

	ArrayList<String> list;
	String[] codes = { "alpha", "lambda", "gamma", "delta", "zeta", "alpha" };
	
	/* Takes args as userCodes.  */
	public CodeKeeper(String[] userCodes) {
		list = new ArrayList<String>();
		
		// Load built-in codes.  Add elements from codes to list.  
		for (int i = 0; i < codes.length; i++) {
			addCode(codes[i]);
		}
		
		// Load user codes.  Add elements from userCodes (args) to the list.  
		for (int j = 0; j < userCodes.length; j++) {
			addCode(userCodes[j]);
		}
		
		// Display all codes.  
		/* No increment statement as the end.  Use iterator to loop through the list.  
		 * The for loop continues as long as list still has next element.  */
		for (Iterator<String> ite = list.iterator(); ite.hasNext(); ) {
			String output = (String) ite.next();
			System.out.println(output);
		}
		
	}
	
	
	private void addCode(String code) {
		/* Add element to list if it doesn't already exist.  Since "alpha" already existed, 
		 * it will not be added again.  */
		if (!list.contains(code)) {
			list.add(code);
		}
	}
	
	
	public static void main(String[] args) {
		new CodeKeeper(args);
	}
	
}
