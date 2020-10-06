package d11p10;

import javax.swing.*;
import java.awt.*;

public class GreaterContainer extends JFrame {

	JButton north = new JButton("North");
	JButton south = new JButton("South");
	JButton west = new JButton("West");
	JButton east = new JButton("East");
	CenterContents center = new CenterContents();
	
	
	public GreaterContainer() {
		setTitle("Multiple Layout Managers");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
		add(west, BorderLayout.WEST);
		add(east, BorderLayout.EAST);
		/* FlowLayout contains a GridLayout.  */
		add(center, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new GreaterContainer();
	}
	
}
