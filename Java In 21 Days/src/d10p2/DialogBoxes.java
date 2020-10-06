package d10p2;

import java.awt.*;
import javax.swing.*;

public class DialogBoxes extends JFrame {
	
	public DialogBoxes() {
		
		/* Default dialog panel with yes, no, and cancel option.  */
		int r1 = JOptionPane.showConfirmDialog(null, "Should I delete all of your irreplaceable personal files?  ");
		System.out.println(r1);
	
		/* Error message with yes and no option.  */
		int r2 = JOptionPane.showConfirmDialog(
				null, 
				"Error reading file.  Want to try again?  ", 
				"File Input Error", 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.ERROR_MESSAGE);
		System.out.println(r2);
		
		/* Input dialog box.  */
		String r3 = JOptionPane.showInputDialog(null, "Enter your name:  ");
		System.out.println(r3);
		
		/* "Enter the Zip Code" is the title of the dialog box.  */
		String r4 = JOptionPane.showInputDialog(
				null, 
				"What is your ZIP code?  ", 
				"Enter ZIP Code", 
				JOptionPane.QUESTION_MESSAGE);
		System.out.println(r4);
		
		/* Message dialog boxes.  */
		JOptionPane.showMessageDialog(null, "The program has been uninstalled.  ");
		
		/* Dialog box with title "Asteroid Destruction Alert" and set the type as WARNING_MESSAGE.  */
		JOptionPane.showMessageDialog(
				null, 
				"An asteroid has destroyed the Earth.  ", 
				"Asteroid Destruction Alert", 
				JOptionPane.WARNING_MESSAGE);
		
		/* Create a String array, then use the String array to create a dialog box.  */
		String[] gender = { "Male", "Female", "None of Your Business" };
		int response = JOptionPane.showOptionDialog(
				null, 
				"What is your gender?  ", 
				"Gender", 
				0, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				gender, 
				gender[2]); // Third option is default choice.  
		System.out.println("You chose " + gender[response]);
		
	}
	
	
	public static void main(String[] args) {
		new DialogBoxes();
	}
	
}