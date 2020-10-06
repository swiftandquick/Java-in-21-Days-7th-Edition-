package d12p8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Multiplier extends JFrame implements FocusListener {

	JTextField factor = new JTextField("0", 5);
	JLabel multiply = new JLabel(" x - 1 = ");
	JTextField product = new JTextField("0", 5);
	
	
	public Multiplier() {
		super("Multiplier");
		setSize(350, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(factor);
		add(multiply);
		add(product);
		
		/* Add focus listener to factor.  */
		factor.addFocusListener(this);
		
		/* Product cannot be edited.  */
		product.setEditable(false);
		
		setVisible(true);
	}
	
	
	/* If the factor is a positive number, then it will calculate the negative 
	 * counterpart of the number.  If the factor is a negative number, both the 
	 * factor and product will reset to 0.  */
	@Override
	public void focusGained(FocusEvent e) {
		Object source = e.getSource();
		if (source == factor) {
			float factorF = Float.parseFloat(factor.getText());
			if (factorF >= 0) {
				float productF = factorF * -1;
				product.setText("" + productF);
			}
			else {
				factor.setText("0");
				product.setText("0");
			}
		}
	}

	
	/* Losing focus will also call the focusGained method.  */
	@Override
	public void focusLost(FocusEvent e) {
		focusGained(e);
	}
	
	
	public static void main(String[] args) {
		new Multiplier();
	}

}
