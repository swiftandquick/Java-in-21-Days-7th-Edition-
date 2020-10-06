package d10p8;

import java.awt.*;
import javax.swing.*;

public class AskFrame extends JFrame {

	public AskFrame() {
		/* Calling constructor is supposed to be the first statement.  */
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JSlider value = new JSlider(0, 255, 100);
		add(value);
		setSize(450, 150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new AskFrame();
	}
	
}
