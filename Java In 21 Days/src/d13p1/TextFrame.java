package d13p1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFrame extends JFrame {

	public TextFrame(String text, String fontName) {
		super("Show Font");
		setSize(425, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* A subclass of JPanel.  */
		TextFramePanel sf = new TextFramePanel(text, fontName);
		add(sf);
		setVisible(true);
	}
	
	
	public static void main(String args[]) {
		String text = "What's the frequency, Kenneth?";
		String fontName = "Arial";
		new TextFrame(text, fontName);
	}
	
}
