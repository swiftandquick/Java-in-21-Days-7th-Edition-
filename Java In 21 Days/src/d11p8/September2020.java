package d11p8;

import java.awt.*;
import javax.swing.*;

/* Displays the calendar of September, 2020.  */
public class September2020 extends JFrame {

	Font font = new Font("Verdana", Font.BOLD, 24);
	JLabel monthName = new JLabel("September");
	JLabel monthNumber = new JLabel("9");
	/* There are 7 different days in a week.  */
	JLabel[] daysOfWeek = new JLabel[7];
	String[] dowString = { "Sunday", "Monday", "Tuesday", 
			"Wednesday", "Thursday", "Friday", "Saturday" };
	/* There are 30 days in September.  */
	JLabel[] days = new JLabel[35];
	/* Look at the calendar.  
	 * Day count starts 1, which starts on index 3.  
	 * Index 3 to 32 are numbers from 1 to 30.  */
	int dayCount = 1; 
	
	public September2020() {
		setTitle("September of 2020");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/* Main layout is a grid layout, top panel displays month, bottom panel displays days.  */
		setLayout(new GridLayout(2, 1));

		/* Create the top panel.  */
		JPanel top = new JPanel();
		GridLayout topLayout = new GridLayout(1, 2, 10, 10);
		top.setLayout(topLayout);
		/* Set font for the labels.  */
		monthName.setFont(font);
		monthNumber.setFont(font);
		/* Make the alignment of the labels center.  */
		monthName.setHorizontalAlignment(SwingConstants.CENTER);
		monthNumber.setHorizontalAlignment(SwingConstants.CENTER);
		top.add(monthName);
		top.add(monthNumber);
		add(top);
		
		/* Create the bottom panel.  */
		JPanel bottom = new JPanel();
		GridLayout bottomLayout = new GridLayout(6, 7, 10, 10);
		bottom.setLayout(bottomLayout);
		/* Add the days of week to first row.  */
		for (int i = 0; i < daysOfWeek.length; i++) {
			daysOfWeek[i] = new JLabel(dowString[i]);
			bottom.add(daysOfWeek[i]);
		}
		/* Add the days to the last 5 rows.  */
		for (int i = 0; i < days.length; i++) {
			if (i >= 3 && i <= 32) {
				days[i] = new JLabel(dayCount + "");
				dayCount++;
			}
			else {
				days[i] = new JLabel("");
			}
			bottom.add(days[i]);
		}
		add(bottom);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new September2020();
	}
	
}