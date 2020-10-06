package d12p4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MousePrank extends JFrame implements ActionListener {

	public MousePrank() {
		super("Message");
		setSize(420, 220);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		
		BorderLayout border = new BorderLayout();
		setLayout(border);
		
		/* Place the message on the top side.  */
		JLabel msg = new JLabel("Click OK to close program.  ");
		add(BorderLayout.NORTH, msg);
		
		/* PrankPanel is a subclass of JPanel, place it below msg.  */
		PrankPanel prank = new PrankPanel();
		/* Add ok button (JButton) to the panel, click the button will exit the application.  */
		prank.ok.addActionListener(this);
		add(BorderLayout.CENTER, prank);
		setVisible(true);
	}
	
	
	/* Click on "OK" button will exit the application.  */
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	
	/* Create new Insets.  */
	public Insets getInsets() {
		return new Insets(40, 10, 10, 10);
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
		new MousePrank();
	}
	
}
