package d13p4;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class CirclePane extends JPanel {

	private float x;
	private float y;
	private float radius;
	private Color color;
	
	public CirclePane(float x, float y, float radius, Color color) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	
	public void paintComponent(Graphics comp) {
		Graphics2D comp2d = (Graphics2D) comp;
		Ellipse2D.Float circle = new Ellipse2D.Float(x, y, radius * 2, radius * 2);
		comp2d.draw(circle);
		comp2d.setColor(color);
		comp2d.fill(circle);
	}
	
}
