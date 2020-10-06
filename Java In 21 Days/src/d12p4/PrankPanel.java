package d12p4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PrankPanel extends JPanel implements MouseMotionListener {

	JButton ok = new JButton("OK");
	int buttonX, buttonY, mouseX, mouseY;
	int width, height;
	
	
	public PrankPanel() {
		super();
		setLayout(null);
		addMouseMotionListener(this);
		buttonX = 110;
		buttonY = 110;
		/* OK button starts out at coordinate (110, 110), with width of 
		 * 70 pixels and height of 20 pixels.  */
		ok.setBounds(new Rectangle(buttonX, buttonY, 70, 20));
		add(ok);
	}
	
	
	public void mouseMoved(MouseEvent e) {
		/* mouseX, mouseY, width, and height are instance variables.  Every time 
		 * mouseMoved is called, those 4 instance variables is updated.  */
		mouseX = e.getX(); // Current x coordinate of the mouse.  
		mouseY = e.getY(); // Current y coordinate of the mouse.  
		width = (int) getSize().getWidth(); // 70
		height = (int) getSize().getHeight(); // 20
		
		/* If mouse comes within 50 pixels range (both horizontally and vertically) 
		 * of the button, the program will call the moveButton method to return a 
		 * new value for either buttonX or buttonY.  */
		if (Math.abs((mouseX + 35) - buttonX) < 50) {
			buttonX = moveButton(mouseX, buttonX, width);
			/* Calling repaint() calls the paintComponent() method.  */
			repaint(); 
		}
		if (Math.abs((mouseY + 35) - buttonY) < 50) {
			buttonY = moveButton(mouseY, buttonY, height);
			repaint(); 
		}
	}
	
	
	public void mouseDragged(MouseEvent e) {
		// Ignore this event.  
	}
	
	
	private int moveButton(int mouseAt, int buttonAt, int bord) {
		/* Button moves left or up if mouse is at the right or down.  */
		if (buttonAt < mouseAt) {
			buttonAt--;
		}
		/* Button moves right or down if mouse is at the left or up.  */
		else {
			buttonAt++;
		}
		/* If button is near the east or south border, set the x-coordinate 
		 * or y-coordinate to 10.  */
		if (buttonAt > (bord - 20)) {
			buttonAt = 10;
		}
		/* If the button is near west or north border, set the y-coordinate 
		 * to (width - 80) or (height - 80).  */
		if (buttonAt < 0) {
			buttonAt = bord - 80;
		}
		/* Return buttonAt as buttonX or buttonY.  */
		return buttonAt;
	}
	
	
	/* Repaint the button based on new buttonX and buttonY values.  */
	public void paintComponent(Graphics comp) {
		super.paintComponent(comp);
		ok.setBounds(buttonX, buttonY, 70, 20);
	}

	
}