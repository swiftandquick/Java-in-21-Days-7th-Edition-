package d11p6;

import java.awt.*;
import javax.swing.*;

public class Absolute extends JFrame {

	public Absolute() {
		super("Example");
		setSize(300, 300);
		setLayout(null);
		JButton myButton = new JButton("Click Me");
		/* The button starts at the coordinate of (10, 10) within the frame, 
		 * the button is 120 pixels wide and 30 pixels tall.  */
		myButton.setBounds(new Rectangle(10, 10, 120, 30));
		add(myButton);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Absolute();
	}
	
}
