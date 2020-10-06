package d11p7;

import java.awt.*;
import javax.swing.*;

public class ThreeButtons extends JFrame {

	public ThreeButtons() {
		super("Program");
		setSize(350, 225);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton alpha = new JButton("Alpha");
		JButton beta = new JButton("Beta");
		JButton gamma = new JButton("Gamma");
	
		/* Flow layout makes components appear next to one another.  */
		setLayout(new FlowLayout());
		
		add(alpha);
		add(beta);
		add(gamma);
		pack();
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ThreeButtons();
	}
	
}
