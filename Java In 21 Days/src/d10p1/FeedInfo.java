package d10p1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FeedInfo extends JFrame {

	/* Leans right side.  */
	private JLabel nameLabel = new JLabel("Name:  ", SwingConstants.RIGHT);
	private JTextField name;
	private JLabel urlLabel = new JLabel("UYRL:  ", SwingConstants.RIGHT);
	private JTextField url;
	private JLabel typeLabel = new JLabel("Type:  ", SwingConstants.RIGHT);
	private JTextField type;
	
	
	public FeedInfo() {
		super("Feed Information");
		setSize(400, 145);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		
		/* Site name.  First dialog box that asks for the a String input.  */
		String response1 = JOptionPane.showInputDialog(null, "Enter the site name:  ");
		/* Set the text field as the response.  */
		name = new JTextField(response1, 20);
		
		/* Site address.  Second dialog box that asks for the a String input.  */
		String response2 = JOptionPane.showInputDialog(null, "Enter the site address:  ");
		url = new JTextField(response2, 20);
		
		/* Site type.  The dialog box's name (top-left) corner is "Site Type", 
		 * the question is "What type of site is it?  "  
		 * Set QUESTION_MESSAGE as the option panel type.  
		 * Add the String array choices as the options.  
		 * choices[0] is the default option, which is "Personal".  */
		String[] choices = { "Personal", "Commercial", "Unknown" };
		int response3 = JOptionPane.showOptionDialog(null, 
				"What type of site is it?  ", 
				"Site Type", 
				0, 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				choices, 
				choices[0]);
		type = new JTextField(choices[response3], 20);
		
		/* Add responses to application.  */
		setLayout(new GridLayout(3, 2));
		add(nameLabel);
		add(name);
		add(urlLabel);
		add(url);
		add(typeLabel);
		add(type);
		setLookAndFeel();
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
		new FeedInfo();
	}
	
}
