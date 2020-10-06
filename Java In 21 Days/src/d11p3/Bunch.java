package d11p3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bunch extends JFrame {

	public Bunch() {
		super("Bunch");
		setSize(260, 260);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		JPanel pane = new JPanel();
		/* Creates a layout with 3 rows, 3 columns.  
		 * 10 pixels horizontal and vertical spacing between spaces.  */
		GridLayout family = new GridLayout(3, 3, 10, 10);
		pane.setLayout(family);
		/* Create and add buttons to the panel, which has grid layout.  */
		JButton marcia = new JButton("Marcia");
		JButton carol = new JButton("Carol");
		JButton greg = new JButton("Greg");
		JButton jan = new JButton("Jan");
		JButton alice = new JButton("Alice");
		JButton peter = new JButton("Peter");
		JButton cindy = new JButton("Cindy");
		JButton mike = new JButton("Mike");
		JButton bobby = new JButton("Bobby");
		pane.add(marcia);
		pane.add(carol);
		pane.add(greg);
		pane.add(jan);
		pane.add(alice);
		pane.add(peter);
		pane.add(cindy);
		pane.add(mike);
		pane.add(bobby);
		/* Add panel to main layout.  */
		add(pane);
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
		new Bunch();
	}
	
}
