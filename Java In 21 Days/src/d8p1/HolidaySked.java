package d8p1;

import java.util.*;

/* Run -> Run Configuration.  
 * Set argument to "50 bbq 170 360 361".  */
public class HolidaySked {

	BitSet sked;
	
	
	public HolidaySked() {
		/* I created a BitSet that can contain 365 bits.  However, the size is 384.  */
		sked = new BitSet(365); 
		// System.out.println(sked.size());
		int[] holiday = { 1, 15, 50, 148, 185, 246, 281, 316, 326, 359 };
		/* Call addHoliday() method, and pass each of the int value from the holiday array.  */
		for (int i = 0; i < holiday.length; i++) {
			addHoliday(holiday[i]);
		}
		/* Even though 148 is initially set to true, it gets clear, so now bit 148 is false.  */
		sked.clear(148);
		/* Set 360 to true.  */
		sked.set(360, true);
		/* Set 361 to false.  */
		sked.set(361, false);
	}
	
	/* Sets a bit of the BitSet to be true.  This means, I set the bits 1, 15, 50, 
	 * 148, 185, 246, 281, 316, 326, 359 are true.  The bits that I have yet to set 
	 * will remain false.  */
	public void addHoliday(int dayToAdd) {
		sked.set(dayToAdd);
	}
	
	
	/* If the dayToCheck value is in BitSet sked, then it will return true.  Otherwise, 
	 * it will return false.  50 is in the set, so it will return true.  170 is not in 
	 * the set, so it will return false.  */
	public boolean isHoliday(int dayToCheck) {
		boolean result = sked.get(dayToCheck);
		return result;
	}
	
	
	public static void main(String[] args) {
		/* Creates an object cal with instance HolidaySkid, calls the constructor.  */
		HolidaySked cal = new HolidaySked();
		/* Iterate through each String element from args array.  */
		for (int i = 0; i < args.length; i++) {
			if (args.length > 0) {
				try {
					/* Convert whichDay each args element to int.  */
					int whichDay = Integer.parseInt(args[i]);
					/* Calls isHoliday() method, pass whichDay as argument.  */
					if (cal.isHoliday(whichDay)) {
						System.out.println("Day number " + whichDay + " is a holiday.  ");
					}
					else {
						System.out.println("Day number " + whichDay + " is not a holiday.  ");
					}
				}
				/* If String cannot be converted to int, then catch the error here.  */
				catch (NumberFormatException nfe) {
					System.out.println("Error:  " + nfe.getMessage());
				}
			}
		}
	}
	
}