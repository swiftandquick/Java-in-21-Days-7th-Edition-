package d9p7;

import javax.swing.*;

public class Subscriptions extends JFrame {
	
	String[] subs = { "Burningbird", "Freeform Goodness", 
			"Ideoplex", "Inessential", "Intertwingly", "Now This", 
			"Rasterweb", "RC3", "Whole Lotta Nothing", "Workbench" };
	/* Add the String array elements to the list.  */
	JList<String> subList = new JList<>(subs);
	
	
	public Subscriptions() {
		super("Subscriptions");
		setSize(150, 335);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		JLabel subLabel = new JLabel("RSS Subscriptions:  ");
		panel.add(subLabel);
		/* Display only 8 items.  */
		subList.setVisibleRowCount(8);
		/* Add scroll pane to subList container.  
		 * Since the container only display 8 items initially, scroll down and 
		 * item 9 and item 10 are visible.  */
		JScrollPane scroller = new JScrollPane(subList);
		panel.add(scroller);
		add(panel);
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
		Subscriptions.setLookAndFeel();
		new Subscriptions();
	}

}
