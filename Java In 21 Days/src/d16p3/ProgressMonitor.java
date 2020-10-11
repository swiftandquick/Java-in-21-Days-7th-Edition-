package d16p3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProgressMonitor extends JFrame {

	JProgressBar current;
	int num = 0; // Initially 0.  
	boolean done = false;
	
	
	public ProgressMonitor() {
		super("Progress Monitor");
		setLookAndFeel();
		/* I cannot close the window by default.  */
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		/* Create an anonymous inner class with instance of WindowAdapter.  
		 * This way, I can avoid generating 10 different methods.  */
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event) {
				// Only if done is true, I can close the window.  
				if (done) {
					// Allow it.  
					dispose();
					System.exit(0);
				}
			}
		});
		
		setSize(400, 100);
		setLayout(new FlowLayout());
		
		/* Progress bar goes from 0 to 2000.  */
		current = new JProgressBar(0, 2000);
		/* Sets the current value as 0 at the start.  */
		current.setValue(0);
		/* Make the progress bar render a String.  */
		current.setStringPainted(true);
		/* Give a preferred size for the current.  */
		current.setPreferredSize(new Dimension(360, 48));
		add(current);
		
		setVisible(true);
		
		/* Calls the iterate method.  */
		iterate();
	}
	
	
	/* Adds 95 to current num value every second.  */
	public final void iterate() {
		while (num < 2000) {
			current.setValue(num);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException ie) {
				// Do nothing.  
			}
			num += 95;
		}
		/* After exiting the while loop, means num > 2000, set done to true.  */
		done = true;
	}
	
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			// Do nothing.  
		}
	}
	
	
	public static void main(String[] args) {
		new ProgressMonitor();
	}
	
}