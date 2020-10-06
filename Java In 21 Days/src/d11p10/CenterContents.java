package d11p10;

import java.awt.*;
import javax.swing.*;

public class CenterContents extends JPanel {

	JLabel l1 = new JLabel("1");
	JLabel l2 = new JLabel("2");
	JLabel l3 = new JLabel("3");
	JLabel l4 = new JLabel("4");
	JLabel l5 = new JLabel("5");
	JLabel l6 = new JLabel("6");
	JLabel l7 = new JLabel("7");
	JLabel l8 = new JLabel("8");
	JLabel l9 = new JLabel("9");
	
	public CenterContents() {
		GridLayout square = new GridLayout(3, 3, 10, 10);
		setLayout(square);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
	}
	
}
