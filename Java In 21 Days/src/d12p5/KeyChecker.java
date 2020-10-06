package d12p5;

import java.awt.*;
import javax.swing.*;

public class KeyChecker extends JFrame {

	JLabel keyLabel = new JLabel("Hit any key");
	
	
	public KeyChecker() {
		super("Hit a Key");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		
		// Elements aligned to center.  
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		KeyMonitor monitor = new KeyMonitor(this);
		/* Since the KeyChecker frame (this) isn't a text area or text field, 
		 * I have to make it focusable in order to handle keyboard events.  
		 * I register KeyChecker to be focusable.  */
		setFocusable(true);
		addKeyListener(monitor);
		add(keyLabel);
		
		setVisible(true);
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
		new KeyChecker();
	}
	
}
