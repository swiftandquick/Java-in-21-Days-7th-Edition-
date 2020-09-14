package d3p8;

import java.util.StringTokenizer;

public class Birthday {

	public static void main(String args[]) {
		StringTokenizer birthday = new StringTokenizer("04/29/2016", "/");
		
		String month = birthday.nextToken();
		String day = birthday.nextToken();
		String year = birthday.nextToken();
		
		System.out.println("Month:  " + month);
		System.out.println("Day:  " + day);
		System.out.println("Year:  " + year);
		
	}
	
}
