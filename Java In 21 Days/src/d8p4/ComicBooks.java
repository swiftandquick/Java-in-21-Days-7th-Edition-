package d8p4;

import java.util.HashMap;

public class ComicBooks {

	public ComicBooks() {
	}
	
	public static void main(String[] args) {
		/* Set up HashMap.  */
		HashMap quality = new HashMap();
		float price0 = 5.00F;
		quality.put("pristine mint", 5.00F);
		/* "mint" is key, 3.00F (price1) is value.  */
		float price1 = 3.00F;
		quality.put("mint", price1);
		float price2 = 2.00F;
		quality.put("near mint", price2);
		float price3 = 1.50F;
		quality.put("very fine", price3);
		float price4 = 1.00F;
		quality.put("fine", price4);
		float price5 = 0.50F;
		quality.put("good", price5);
		float price6 = 0.25F;
		quality.put("poor", price6);
		float price7 = 0.10F;
		quality.put("coverless", price7);
		
		/* Set up collection.  */
		Comic[] comix = new Comic[3];
		
		comix[0] = new Comic("Amazing Spider-Man", "1A", "very fine", 12_000.00F);
		/* comix[0].condition is "very fine".  
		 * quality.get("very fine"):  "very fine" is the key, and the get() method 
		 * retrieves value based on the key, so it gets the value 3.00F.  Then, the 
		 * value 3.00F is pass as setPrice's argument.  */
		comix[0].setPrice( (Float) quality.get(comix[0].condition) );

		comix[1] = new Comic("Incredible Hulk", "181", "near mint", 680.00F);
		/* get("near mint") retrieves the value 1.50F.  Then, the value 1.50F is 
		 * pass as setPrice's argument.  */
		comix[1].setPrice( (Float) quality.get(comix[1].condition) );
		
		comix[2] = new Comic("Cerebus", "1A", "good", 190.00F);
		/* get("good") retrieves the value 0.50F.  Then, the value 0.50F is pass 
		 * as the setPrice's argument.  */
		comix[2].setPrice( (Float) quality.get(comix[2].condition) );
		
		/* Iterates through every comix */
		for (int i = 0; i < comix.length; i++) {
			System.out.println("Title:  " + comix[i].title);
			System.out.println("Issue:  " + comix[i].issueNumber);
			System.out.println("Condition:  " + comix[i].condition);
			System.out.println("Price:  $" + comix[i].price + "\n");
		}
	}
	
}
