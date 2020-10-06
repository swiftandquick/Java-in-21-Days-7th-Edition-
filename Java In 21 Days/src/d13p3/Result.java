package d13p3;

import java.awt.*;
import javax.swing.*;

public class Result extends JFrame {

	public Result() {
		super("Result");
		/* getSize() is called before size is set, thus the returned value is 0.  */
		JLabel width = new JLabel("This frame is " + getSize().width + " pixels wide.  ");
		add("North", width);
		setSize(220, 120);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Result();
	}
	
}
