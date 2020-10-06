package d9p6;

import javax.swing.*;

import d9p5.FormatFrame;

public class FormatFrame2 extends JFrame {
	
	/* List of items to be added to combo box.  */
	String[] formats = { "Atom", "RSS 0.92", "RSS 1.0", "RSS 2.0" };
	/* Add the formats array elements to the JComboBox.  */
	JComboBox formatBox = new JComboBox(formats); 
	
	
	public FormatFrame2() {
		super("Choose a Format");
		setSize(220, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		JLabel formatLabel = new JLabel("Output formats:  ");
		pane.add(formatLabel);
		pane.add(formatBox);
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
		FormatFrame2.setLookAndFeel();
		new FormatFrame2();
	}
	
}
