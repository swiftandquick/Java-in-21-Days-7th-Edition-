package d4p8;

public class Cases {

	public static void main(String[] args) {
		float x = 9;
		float y = 5;
		int z = (int) (x / y);
		
		switch (z) {
			/* Since there is no break statement, statements inside 
			 * case 2 and default are also executed.  */
			case 1:  
				x = x + 2;
			case 2:  
				x = x + 3;
			default:  
				x = x + 1;
		}
		System.out.println("Value of x:  " + x);
	}
	
}
