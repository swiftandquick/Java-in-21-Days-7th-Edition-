package d14p2;

import java.awt.*;
import javax.swing.*;

public class SliderFrame extends JFrame {

	public SliderFrame() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* First argument in JSlider is the min value, which is 0.  If I don't 
		 * set the size of the mainframe, there will be nothing display in 
		 * the frame while the program still runs.  */
		JSlider value = new JSlider(0, 255, 100);
		/* However, after I set the size of the frame itself, it overrides 
		 * size set on value (JSlider).  Thus, the program compiles without 
		 * error and runs correctly.  */
		setSize(325, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SliderFrame();
	}
	
}
