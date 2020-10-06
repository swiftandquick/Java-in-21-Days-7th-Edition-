package d13p5;

import java.awt.*;
import javax.swing.*;

public class PieGraph extends JFrame {

	public PieGraph() {
		super("Pie Graph");
		setSize(322, 322);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* PiePanel is a JPanel subclass.  */
		PiePanel pie = new PiePanel(4);
		/* Calls addSlice method from PiePanel.  */
		pie.addSlice(Color.green, 20F);
		pie.addSlice(Color.blue, 33F);
		pie.addSlice(Color.red, 2F);
		pie.addSlice(Color.yellow, 5F);
		add(pie);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new PieGraph();
	}
	
}
