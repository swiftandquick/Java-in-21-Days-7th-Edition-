package d8p8;

public class Comic {

	String title;
	String issueNumber;
	String condition;
	float basePrice;
	float price;
	
	Comic(String inTitle, String inIssueNumber, String inCondition, float inBasePrice) {
		title = inTitle;
		issueNumber = inIssueNumber;
		condition = inCondition;
		basePrice = inBasePrice;
	}
	
	/* Use basePrice multiply the factor, which is a value pass from ComicBooks.java class.  */
	void setPrice(float factor) {
		price = basePrice * factor; 
	}
	
}
