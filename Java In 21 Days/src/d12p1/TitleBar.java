package d12p1;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/* Implements ActionListener interface to handle events.  */
public class TitleBar extends JFrame implements ActionListener {

	JButton b1;
	JButton b2;
	
	public TitleBar() {
		super("Title Bar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		
		b1 = new JButton("Rosencrantz");
		b2 = new JButton("Guildenstern");
		b1.addActionListener(this);
		b2.addActionListener(this);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(b1);
		add(b2);
		pack();
		setVisible(true);
	}
	
	
	/* Handle events here.  */
	public void actionPerformed(ActionEvent e) {
		/* Retrieves the source object.  */
		Object source = e.getSource();
		/* Title changes depend on the button that is clicked on.  */
		if (source == b1) {
			setTitle("Rosencrantz");
		}
		else if (source == b2) {
			setTitle("Guildenstern");
		}
		repaint();
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
		new TitleBar();
	}
	
}
