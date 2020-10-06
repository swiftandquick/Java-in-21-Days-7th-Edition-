package d10p4;

import java.awt.*;
import javax.swing.*;

public class FeedBar extends JFrame {

	public FeedBar() {
		super("FeedBar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		// Creates icon.  
		ImageIcon loadIcon = new ImageIcon("src/d10p4/load.gif");
		ImageIcon saveIcon = new ImageIcon("src/d10p4/save.gif");
		ImageIcon subscribeIcon = new ImageIcon("src/d10p4/subscribe.gif");
		ImageIcon unsubscribeIcon = new ImageIcon("src/d10p4/ubsubscribe.gif");
		// Create buttons.  
		JButton load = new JButton("Load", loadIcon);
		JButton save = new JButton("Save", saveIcon);
		JButton subscribe = new JButton("Subscribe", subscribeIcon);
		JButton unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
		// Add buttons to toolbar.  
		JToolBar bar = new JToolBar();
		bar.add(load);
		bar.add(save);
		bar.add(subscribe);
		bar.add(unsubscribe);
		// Prepare user interface.  
		JTextArea edit = new JTextArea(8, 40);
		JScrollPane scroll = new JScrollPane(edit);
		BorderLayout bord = new BorderLayout();
		setLayout(bord);
		/* Add the toolbar at top side.  Toolbar can be pick up and move around.  */
		add("North", bar);
		/* Add the text area with scroll pane in center.  */
		add("Center", scroll);
		pack();
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
		new FeedBar();
	}
	
}
