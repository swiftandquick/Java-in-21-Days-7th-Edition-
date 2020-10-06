package d12p5;

import java.awt.event.*;

/* KeyMonitor is A subclass and adapter class of KeyAdapter, 
 * here, keyboard events are handled without having to implement 
 * the KeyListener interface.  */
public class KeyMonitor extends KeyAdapter {

	KeyChecker display;
	
	
	KeyMonitor(KeyChecker display) {
		this.display = display;
	}
	
	
	/* Updates the keyLabel's display text every time I type something on 
	 * the focusable main frame.  */
	public void keyTyped(KeyEvent e) {
		display.keyLabel.setText("" + e.getKeyChar());
		display.repaint();
	}
	
}
