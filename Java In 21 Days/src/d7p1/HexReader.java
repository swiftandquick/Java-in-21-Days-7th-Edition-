package d7p1;

class HexReader {

	String[] input = { "000A110D1D260219 ", "78700F1318141E0C ", "6A197D45B0FFFFFF " };
	
	public static void main(String[] args) {
		HexReader hex = new HexReader(); 
		/* For each String element in input array, call the readLine method.  */
		for (int i = 0; i < hex.input.length; i++ ) {
			hex.readLine(hex.input[i]);
		}
	}
	
	/* Takes an individual String as argument.  */
	void readLine(String code) {
		try {
			/* Increment j by 2 for each iteration.  */
			for (int j = 0; j + 1 < code.length(); j += 2) {
				/* For each iteration, translates 2 digit hexadecimal to decimal.  */
				String sub = code.substring(j, j + 2);
				int num = Integer.parseInt(sub, 16);
				/* FF = 255 in decimal, so if there is a "FF" pair that appears in the String, 
				 * num will equal to 255, which will make the read the "return" statement, 
				 * exiting out of the try block and moves onto the finally block.  */
				if (num == 255) {
					return;
				}
				System.out.print(num + " ");
			}
		}
		finally {
			System.out.println();
		}
	}
	
}
