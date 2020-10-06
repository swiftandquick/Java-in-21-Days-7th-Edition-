package d10p5;

import javax.swing.*;
import java.awt.*;

public class ProgressMonitor extends JFrame {

	JProgressBar current; // Progress bar based on current value.  
	JTextArea out;
	JButton find;
	int num = 0; // Starting alue is 0.  
	JLabel label = new JLabel("");
	
	
	public ProgressMonitor() {
		super("Progress Monitor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setSize(205, 68);
		setLayout(new FlowLayout());
		/* Progress bar goes from 0 to 2000.  */
		current = new JProgressBar(0, 2000);
		/* Current value is set to 0.  */
		current.setValue(0);
		/* Displays the percentage of the progress.  */
		current.setStringPainted(true);
		add(current);
		/* Add the label that describes the number.  */
		add(label);
		setVisible(true);
		/* Calls the iterate method to start the progress.  */
		iterate();
	}
	
	
	public void iterate() {
		while (num < 2000) {
			/* Change the current value based on num.  */
			current.setValue(num);
			/* Reset the label every iteration.  */
			label.setText(num + "");
			/* num increases by the value of 95 every second.  */
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// Do nothing.  
			}
			num += 95;
		}
	}

	
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		new ProgressMonitor();
	}
	
}
