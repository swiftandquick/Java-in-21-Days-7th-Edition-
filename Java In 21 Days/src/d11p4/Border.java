package d11p4;

import java.awt.*;
import javax.swing.*;

public class Border extends JFrame {

	public Border() {
		super("Border");
		setSize(240, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		/* Set border layout with an anonymous object.  */
		setLayout(new BorderLayout());
		JButton nButton = new JButton("North");
		JButton sButton = new JButton("South");
		JButton eButton = new JButton("East");
		JButton wButton = new JButton("West");
		JButton cButton = new JButton("Center");
		/* Add buttons to their respective position.  */
		add(nButton, BorderLayout.NORTH);
		add(sButton, BorderLayout.SOUTH);
		add(eButton, BorderLayout.EAST);
		add(wButton, BorderLayout.WEST);
		add(cButton, BorderLayout.CENTER);
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
		new Border();
	}
	
}
