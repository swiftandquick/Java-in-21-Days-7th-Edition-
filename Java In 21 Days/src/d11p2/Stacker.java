package d11p2;

import javax.swing.*;
import java.awt.*;

public class Stacker extends JFrame {
	
	public Stacker() {
		super("Stacker");
		setSize(430, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		// Create top panel.  
		JPanel commandPane = new JPanel();
		/* Top panel's layout has components align from left to right.  */
		BoxLayout horizontal = new BoxLayout(commandPane, BoxLayout.X_AXIS);
		commandPane.setLayout(horizontal);
		JButton subscribe = new JButton("Subscribe");
		JButton unsubscribe = new JButton("Unsubscribe");
		JButton refresh = new JButton("Refresh");
		JButton save = new JButton("Save");
		commandPane.add(subscribe);
		commandPane.add(unsubscribe);
		commandPane.add(refresh);
		commandPane.add(save);
		// Create bottom panel.  
		JPanel textPane = new JPanel();
		JTextArea text = new JTextArea(4, 70);
		JScrollPane scrollPane = new JScrollPane(text);
		// Add both panels to layout.  
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(commandPane);
		add(scrollPane);
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
		new Stacker();
	}
}
