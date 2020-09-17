package d8p7;

public class Recursion {

	public int dex = -1;
	
	
	/* Call getValue and pass 17 as argument.  
	 * dex retrieves the value 136, and dex = 136.  */
	public Recursion() {
		dex = getValue(17);
	}
	
	
	/* Since 17 > 100 is false, call getValue again and double dexValue to 34.  
	 * 34 > 100 is still false, call getValue again and double dexValue to 68.  
	 * 68 > 100 is still false, call getValue again and double dexValue to 136.  
	 * 136 > 100 is true, return dexValue.  */
	public int getValue(int dexValue) {
		if (dexValue > 100) {
			return dexValue;
		}
		else {
			return getValue(dexValue * 2);
		}
	}
	
	
	public static void main(String[] args) {
		/* Create object r, then call the constructor.  */
		Recursion r = new Recursion();
		/* Prints out the r object's instance variable "dex", which is 136.  */
		System.out.println(r.dex);
	}
	
}
