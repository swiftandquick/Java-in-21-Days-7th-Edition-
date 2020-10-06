package d12p6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyChecker2 extends JFrame {

	JLabel keyLabel = new JLabel("Hit any key");
	
	
	public KeyChecker2() {
		super("Hit a key");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		/* It's better to keep codes simple and clean, using adapter classes 
		 * as inner classes reduce the amount of codes written.  */
		KeyAdapter monitor = new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				keyLabel.setText("" + e.getKeyChar());
				repaint();
			}
		};
		
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
		new KeyChecker2();
	}
	
}
