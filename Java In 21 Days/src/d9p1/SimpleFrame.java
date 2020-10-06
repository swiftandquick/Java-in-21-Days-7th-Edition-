package d9p1;

import javax.swing.*;

public class SimpleFrame extends JFrame {
	
	public SimpleFrame() {
		super("Frame Title"); // Title
		setSize(300, 100); // Size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Terminates the program on exit.  
		setLookAndFeel(); // Call the setLookAndFeel() method.  
		setVisible(true); // Make the application visible.  
	}
	
	
	public static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			// Ignore error.  
		}
	}
	
	
	public static void main(String[] args) {
		/* Calls the constructor.  */
		new SimpleFrame();
	}

}
