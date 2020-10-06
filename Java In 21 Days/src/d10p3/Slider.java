package d10p3;

import javax.swing.*;

public class Slider extends JFrame {

	public Slider() {
		super("Slider");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		/* Creates a horizontal slider with minimum value of 0, 
		 * maximum value of 30, and starting value of 5.  */
		JSlider pick = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
		/* Major tick spacing is 10.  */
		pick.setMajorTickSpacing(10);
		/* Minor tick spacing is 1.  */
		pick.setMinorTickSpacing(1);
		/* Paint the minor ticks.  */
		pick.setPaintTicks(true);
		/* Gives major ticks (10, 20, 30) labels.  */
		pick.setPaintLabels(true);
		add(pick);
		pack();
		setVisible(true);
	}
	
	
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		new Slider();
	}
	
}