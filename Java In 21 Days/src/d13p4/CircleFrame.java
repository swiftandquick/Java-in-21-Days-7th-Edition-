package d13p4;

import java.awt.*;
import javax.swing.*;

public class CircleFrame extends JFrame {

	public CircleFrame(float x, float y, float radius, Color color) {
		super("Circle");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CirclePane circle = new CirclePane(x, y, radius, color);
		add(circle);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		float x = 25;
		float y = 25;
		float radius = 100;
		Color color = Color.black;
		new CircleFrame(x, y, radius, color);
	}
	
}
