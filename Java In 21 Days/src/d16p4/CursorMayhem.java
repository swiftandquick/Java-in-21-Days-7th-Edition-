package d16p4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CursorMayhem extends JFrame {

	JButton harry, wade, hansel;
	
	
	public CursorMayhem() {
		super("Choose a Cursor");
		setLookAndFeel();
		setSize(400, 80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		harry = new JButton("Crosshair");
		add(harry);
		wade = new JButton("Wait");
		add(wade);
		hansel = new JButton("Hand");
		add(hansel);
		
		/* Instead of implementing ActionListener interface, I created an 
		 * anonymous inner class for the same purpose.  The "act" is the 
		 * object name of the ActionListener instance.  */
		ActionListener act = new ActionListener() {
			/* actionPerformed must be created inside ActionListener class.  */
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == harry) {
					setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
				}
				if (event.getSource() == wade) {
					setCursor(new Cursor(Cursor.WAIT_CURSOR));
				}
				if (event.getSource() == hansel) {
					setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
			}
		};
		
		// Add action listener to the buttons to the act object.  
		harry.addActionListener(act);
		wade.addActionListener(act);
		hansel.addActionListener(act);
		
		setVisible(true);
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
		new CursorMayhem();
	}
	
}
