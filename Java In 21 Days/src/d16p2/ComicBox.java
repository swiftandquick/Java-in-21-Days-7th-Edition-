package d16p2;

import java.util.*;

public class ComicBox {

	class InnerComic {
		String title;
		String issueNumber;
		String condition;
		float basePrice;
		float price;
		
		InnerComic(String inTitle, String inIssueNumber, 
				String inCondition, float inBasePrice) {
			title = inTitle;
			issueNumber = inIssueNumber;
			condition = inCondition;
			basePrice = inBasePrice;
		}
		
		void setPrice(float factor) {
			price = basePrice * factor;
		}
	}
	
	
	public ComicBox() {
		HashMap<String, Float> quality = new HashMap<>();

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
		
		InnerComic[] comix = new InnerComic[3];
		
		/* Set the title, issue number, condition, and base price.  */
		comix[0] = new InnerComic("Amazing Spider-Man", "1A", "very fine", 12_000.00F);
		/* Use condition to set the final price.  comix[0].condition is "very fine", 
		 * quality.get("very fine" gets the key price3, which is equivalent to 1.50F.  
		 * 1.50F is then pass to the setPrice method in InnerComic class.  While 
		 * in InnerComic class, I calculate the final price by multiplying the price, 
		 * which is 12000, and the factor, which is 1.5, the result is 18000.  */
		comix[0].setPrice(quality.get(comix[0].condition));
		comix[1] = new InnerComic("Incredible Hulk", "181", "near mint", 680.00F);
		comix[1].setPrice(quality.get(comix[1].condition));
		comix[2] = new InnerComic("Cerebus", "1A", "good", 190.00F);
		comix[2].setPrice(quality.get(comix[2].condition));

		for (InnerComic comic : comix) {
			System.out.println("Title:  " + comic.title);
			System.out.println("Issue Number:  " + comic.issueNumber);
			System.out.println("Condition:  " + comic.condition);
			System.out.println("Price:  $" + comic.price + "\n");
		}
		
	}
	
	
	public static void main(String[] args) {
		new ComicBox();
	}
	
}