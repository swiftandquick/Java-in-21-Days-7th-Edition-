package d6p7;

public class ZipCode {

	private String zipcode;
	
	ZipCode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public boolean validZC() {
		if (zipcode.length() == 5) {
			/* Transforms String to char array.  */
			char[] zipcodeCA = zipcode.toCharArray();
			for (int i = 0; i < zipcodeCA.length; i++) {
				/* In ASCII table, 0 to 9 represents the numbers 0 to 9 respectively.  
					So if any of the character is not a number (out of range of 0 to 9), 
					then return false.  */
				if (zipcodeCA[i] < '0' || zipcodeCA[i] > '9') {
					return false;
				}
			}
			/* Return true if the entire String is made up of numbers.  */
			return true;
		}
		else {
			return false;
		}
	}
	
}
