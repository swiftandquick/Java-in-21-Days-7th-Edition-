package d8p8;

import java.util.HashMap;

public class ComicBooks {

	public ComicBooks() {
	}
	
	
	public static String getCondition(Condition con) {
		switch (con) {
			case PRISTINE_MINT:
				return "pristine mint";
			case MINT:
				return "mint";
			case NEAR_MINT:
				return "very fine";
			case VERY_FINE:
				return "very fine";
			case FINE:
				return "fine";
			case GOOD:
				return "good";
			case POOR:
				return "poor";
			case COVERLESS:
				return "coverless";
			default:
				return "";
		}
	}
	
	
	public static float getMultiplier(String condition) {
		switch (condition) {
		case "pristine mint":
			return 5.00F;
		case "mint":
			return 3.00F;
		case "near mint":
			return 2.00F;
		case "very fine":
			return 1.50F;
		case "fine":
			return 1.00F;
		case "good":
			return 0.50F;
		case "poor":
			return 0.25F;
		case "coverless":
			return 0.10F;
		default:
			return 0.00F;
	}
	}
	
	
	public static void main(String[] args) {
		
		Comic[] comix = new Comic[3];
		
		/* Use getCondition() method to retrieve String based on enum value.  */
		comix[0] = new Comic("Amazing Spider-Man", "1A", getCondition(Condition.VERY_FINE), 12_000.00F);
		/* Use getMultiplier() to get multiplier in float based on comix's condition.  */
		comix[0].setPrice( getMultiplier(comix[0].condition) );

		comix[1] = new Comic("Incredible Hulk", "181", "near mint", 680.00F);
		comix[1].setPrice( getMultiplier(comix[1].condition) );
		
		comix[2] = new Comic("Cerebus", "1A", "good", 190.00F);
		comix[2].setPrice( getMultiplier(comix[2].condition) );
		
		for (int i = 0; i < comix.length; i++) {
			System.out.println("Title:  " + comix[i].title);
			System.out.println("Issue:  " + comix[i].issueNumber);
			System.out.println("Condition:  " + comix[i].condition);
			System.out.println("Price:  $" + comix[i].price + "\n");
		}
	}
	
}