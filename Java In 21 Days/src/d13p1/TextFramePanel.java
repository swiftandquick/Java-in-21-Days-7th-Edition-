package d13p1;

import java.awt.*;
import javax.swing.*;

public class TextFramePanel extends JPanel {

	String text;
	String fontName;
	
	/* Constructor.  */
	public TextFramePanel(String text, String fontName) {
		super();
		this.text = text; 
		this.fontName = fontName; 
	}
	
	
	public void paintComponent(Graphics comp) {
		super.paintComponent(comp);
		// Casting comp into Graphics2D type.  
		Graphics2D comp2D = (Graphics2D) comp;
		// Enables antialiasing.  
		comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
				RenderingHints.VALUE_ANTIALIAS_ON);
		// Set the current font to arial, bold, and size 18.  
		Font font = new Font(fontName, Font.BOLD, 18);
		// Creates the font metrics object.  
		FontMetrics metrics = getFontMetrics(font);
		comp2D.setFont(font);
		/* getSize().width gets the width of the panel.  
		 * getSize().height gets the height of the panel.  
		 * metrics.stringWidth(text) gets the width of the text (String).  */
		/* Use panel's width and height to determine where the text should be displayed.  
		 * The text should be displayed in the middle of the panel.  */
		int x = (getSize().width - metrics.stringWidth(text)) / 2;
		int y = getSize().height / 2;
		comp2D.drawString(text, x, y);
	}
	
}
