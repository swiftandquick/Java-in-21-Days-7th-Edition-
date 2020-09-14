package d6p7;

import java.util.LinkedList;

public class ZipCode_Demo {

	static LinkedList<String> list = new LinkedList<String>();
	
	public static void main(String[] args) {
		
		String[] zipcodes = { "424281", "4811", "89623", "42981", "qw842", "jj", "90631" };
		
		for (int i = 0; i < zipcodes.length; i++) {
			if (new ZipCode(zipcodes[i]).validZC()) {
				list.add(zipcodes[i]);
			}
		}
		
		/* Print all valid zipcodes.  */
		for (String zipcode : list) {
			System.out.println(zipcode);
		}
		
	}
	
}
