package d4p9;

import java.util.Scanner;

public class DayCounter {

	public static void main(String args[]) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Year:  ");
		 int year = input.nextInt();
		 
		 for (int month = 1; month <= 12; month++) {
			 int days = countDays(year, month);
			 for (int day = 1; day <= days; day++) {
				 System.out.print(month + "/" + day + "  ");
			 }
			 System.out.println();
		 }
		 
		 input.close();
	}
	
	public static int countDays(int year, int month) {
		int days = -1;
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				/* Leap year.  */
				if (year % 4 == 0 || ((year % 100 == 0) && (year % 400 != 0))) 
					days = 29;
				/* Non-Leap year.  */
				else
					days = 28;
		}
		return days;

	}
	
}
