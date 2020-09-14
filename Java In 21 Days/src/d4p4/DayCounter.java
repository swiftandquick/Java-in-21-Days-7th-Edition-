package d4p4;

/* Run -> Run Configurations.  In the arguments field, 
 * I place "9 2020" as arguments.  */

class DayCounter {

	public static void main(String[] arguments) {
		/* Default month and year.  */
		int yearIn = 2016;
		int monthIn = 1;
		
		/* If arguments' size is > 0, set index 0 (first variable) as month.  */
		if  (arguments.length > 0)
			/* Because arguments are always stored as String, so I have to convert it to int first.  */
			monthIn = Integer.parseInt(arguments[0]);
		/* If arguments' size is > 1, set index 1 (second variable) as month.  */
		if (arguments.length > 1) 
			yearIn = Integer.parseInt(arguments[1]);
		/* Calls countDays method, pass in monthIn and yearIn as arguments.  */
		System.out.println(monthIn + "/" + yearIn + " has " + countDays(monthIn, yearIn) + " days.  ");
	}
	
	/* Calling from static method, so countDays also has to be a static method.  */
	static int countDays(int month, int year) {
		/* Initialize the count variable.  */
		int count = -1;
		switch (month) {
			case 1: 
			case 3: 
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12:
				count = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				count = 30;
				break;
			case 2:
				/* Leap year.  */
				if (year % 4 == 0 || ((year % 100 == 0) && (year % 400 != 0))) 
					count = 29;
				/* Non-Leap year.  */
				else
					count = 28;
		}
		return count;
	}
	
}
