package d10p6;

import java.awt.*;
import javax.swing.*;

public class FeedBar2 extends JFrame {

	public FeedBar2() {
		super("FeedBar 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		// Create icons.  
		ImageIcon loadIcon = new ImageIcon("src/d10p6/load.gif");
		ImageIcon saveIcon = new ImageIcon("src/d10p6/save.gif");
		ImageIcon subscribeIcon = new ImageIcon("src/d10p6/subscribe.gif");
		ImageIcon unsubscribeIcon = new ImageIcon("src/d10p6/unsubscribe.gif");
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
		// Create menu.  
		JMenuItem j1 = new JMenuItem("Load");
		JMenuItem j2 = new JMenuItem("Save");
		JMenuItem j3 = new JMenuItem("Subscribe");
		JMenuItem j4 = new JMenuItem("Unsubscribe");
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Feeds");
		menu.add(j1);
		menu.add(j2);
		menu.addSeparator(); // Add a line between j2 and j3.  
		menu.add(j3);
		menu.add(j4);
		menubar.add(menu);
		// Prepare user interface.  
		JTextArea edit = new JTextArea(8, 40);
		JScrollPane scroll = new JScrollPane(edit);
		BorderLayout bord = new BorderLayout();
		setLayout(bord);
		add("North", bar);
		add("Center", scroll);
		/* Set the menu bar above the tool bar.  */
		setJMenuBar(menubar);
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
		new FeedBar2();
	}
	
}
