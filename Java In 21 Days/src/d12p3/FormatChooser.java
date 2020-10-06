package d12p3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* Implement ItemListener to handle item events.  */
public class FormatChooser extends JFrame implements ItemListener {

	String[] formats = { "(choose format)", "Atom", 
			"RSS 0.92", "RSS 1.0", "RSS 2.0" };
	String[] descriptions = {
			"Atom weblog and syndication format", 
			"RSS syndication format 0.92 (Netscape)", 
			"RSS/RDF syndication format 1.0 (RSS/RDF)", 
			"RSS syndication format 2.0 (UserLand)" };
	JComboBox<String> formatBox = new JComboBox<String>();
	JLabel descriptionLabel = new JLabel("");
	
	
	public FormatChooser() {
		super("Syndication Format");
		setSize(420, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setLayout(new BorderLayout());
		/* Add each formats element to the combo box.  */
		for (int i = 0; i < formats.length; i++) {
			formatBox.addItem(formats[i]);
		}
		formatBox.addItemListener(this);
		add(BorderLayout.NORTH, formatBox);
		add(BorderLayout.CENTER, descriptionLabel);
		setVisible(true);
	}
	
	
	public void itemStateChanged(ItemEvent e) {
		/* choice is the index of the item that is selected.  */
		int choice = formatBox.getSelectedIndex();
		/* If choice is not in index 0, or "(choose format", display 
		 * the corresponding description.  */
		if (choice > 0) {
			/* If "Atom" is selected, "Atom weblog..."  will be displayed.  
			 * Since valid choices start from index 1, but the corresponding 
			 * descriptions start at index 0.  */
			descriptionLabel.setText(descriptions[choice - 1]);
		}
	}
	
	
	/* Determines the insets of the container.  */
	public Insets getInsets() {
		return new Insets(50, 10, 10, 10);
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
		new FormatChooser();
	}
	
}