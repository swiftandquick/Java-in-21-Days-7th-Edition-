package d13p2;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Map extends JFrame {

	public Map() {
		super("Map");
		setSize(360, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* Subclass to JPanel.  */
		MapPane map = new MapPane();
		add(map);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Map frame = new Map();
	}
	
}
