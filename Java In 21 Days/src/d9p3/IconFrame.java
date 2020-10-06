package d9p3;

import javax.swing.*;

public class IconFrame extends JFrame {

	JButton load, save, subscribe, unsubscribe;
	
	
	public IconFrame() {
		super("Icon Frame");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		/* Relative path starts at src folder.  */
		ImageIcon loadIcon = new ImageIcon("src/d9p3/load.gif");
		ImageIcon saveIcon = new ImageIcon("src/d9p3/save.gif");
		ImageIcon subscribeIcon = new ImageIcon("src/d9p3/subscribe.gif");
		ImageIcon unsubscribeIcon = new ImageIcon("src/d9p3/unsubscribe.gif");
		/* Create buttons with text and icons.  */
		load = new JButton("Load", loadIcon);
		save = new JButton("Save", saveIcon);
		subscribe = new JButton("Subscribe", subscribeIcon);
		unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
		/* Add the buttons to the panel.  */
		panel.add(load);
		panel.add(save);
		panel.add(subscribe);
		panel.add(unsubscribe);
		/* Add the panel to a frame.  */
		add(panel);
		pack();
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new IconFrame();
	}
	
}
