package d12p2;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/* Implements FocusListener to handle focus events.  */
public class Calculator extends JFrame implements FocusListener {

	JTextField value1, value2, sum;
	JLabel plus, equals;
	
	
	public Calculator() {
		super("Add Two Numbers");
		setSize(350, 90);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
		setLayout(flow);
		// Create components.  
		value1 = new JTextField("0", 5);
		plus = new JLabel("+");
		value2 = new JTextField("0", 5);
		equals = new JLabel("=");
		sum = new JTextField("0", 5);
		// Add listeners.  
		value1.addFocusListener(this);
		value2.addFocusListener(this);
		// Set up sum field.  
		sum.setEditable(false);
		// Add components.  
		add(value1);
		add(plus);
		add(value2);
		add(equals);
		add(sum);
		setVisible(true);
	}
	
	
	/* Determines which component gets focus.  If focus is on value1 or value2, 
	 * which means if my cursor is currently on value1, then I change my cursor 
	 * to value2, or vice versa, then focusGained() method is called.  */
	public void focusGained(FocusEvent e) {
		try {
			/* Set the text of sum to the total of value1 and value2.  */
			float total = Float.parseFloat(value1.getText()) + 
					Float.parseFloat(value2.getText());
			sum.setText("" + total);
		}
		/* Reset everything if input isn't convertible.  */
		catch (NumberFormatException nfe) {
			value1.setText("0");
			value2.setText("0");
			sum.setText("0");
		}
	}
	
	
	/* If focus is lost (cursor) is no longer on value1 or value2.  For example, 
	 * I click on the sum text field, then I also call the focusGained method. */
	public void focusLost(FocusEvent e) {
		focusGained(e);
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
		new Calculator();
	}
	
}
