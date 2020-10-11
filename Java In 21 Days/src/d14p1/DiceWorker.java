package d14p1;

import javax.swing.*;

/* SwingWorker:  Used to run time-consuming tasks.  
DiceWorker is a SwingWorker subclass that handles the dice rolls.  */
public class DiceWorker extends SwingWorker {

	// Instance variable.  
	int timesToRoll;
	
	// Constructor.  
	public DiceWorker(int timesToRoll) {
		super();
		this.timesToRoll = timesToRoll;
	}
	
	
	/* doInBackground():  performs task in the background.  
	 * This method returns an int array.  */
	@Override
	protected int[] doInBackground() {
		/* Since it's an int array and I haven't initialize any any indexes, 
		 * this means all 16 indexes start at 0.  */
		int[] result = new int[16];
		/* Rolls the exact amount of times as the quantity input.  */
		for (int i = 0; i < this.timesToRoll; i++) {
			/* sum is set to 0 every iteration.  */
			int sum = 0;
			/* For each iteration, dice is rolled 3 times.   */
			for (int j = 0; j < 3; j++) {
				/* Calculate the sum of 3 numbers from 1 to 6.  Which 
				 * means calculate the sum of 3 dice.  */
				sum += Math.floor(Math.random() * 6);
			}
			/* Depends on what the sum value is, if sum is 5, then 
			 * increment result[5] by 1.  If sum is 5 for the second 
			 * time, increment result[5] from 1 to 2.  */
			result[sum] = result[sum] + 1;
		}
		// Return the result as an int array.  
		return result; 
	}
	
}
