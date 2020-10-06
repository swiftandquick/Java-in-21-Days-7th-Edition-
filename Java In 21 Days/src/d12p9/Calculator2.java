package d12p9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator2 extends JFrame implements ActionListener {

	JLabel label1 = new JLabel("First Number:  ");
	JTextField num1 = new JTextField("0", 13);
	JLabel label2 = new JLabel("Second Number:  ");
	JTextField num2 = new JTextField("0", 13);
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JLabel label3 = new JLabel("Result:  ");
	JTextField result = new JTextField("0", 13);
	
	
	public Calculator2() {
		setTitle("Calculator"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(4, 2, 10, 10));
		
		add(label1);
		add(num1);
		add(label2);
		add(num2);
		
		add(plus);
		add(minus);
		/* Add listeners to plus and minus buttons.  */
		plus.addActionListener(this);
		minus.addActionListener(this);
		
		add(label3);
		add(result);
		// Set result to non-editable.  
		result.setEditable(false);
		
		pack();
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		try {
			float num1F = Float.parseFloat(num1.getText());
			float num2F = Float.parseFloat(num2.getText());
			/* Add or subtract based on button clicked.  */
			if (source == plus) {
				float sum = num1F + num2F;
				result.setText(sum + "");
			}
			else if (source == minus) {
				float difference = num1F - num2F;
				result.setText(difference + "");
			}
		}
		/* If num1 or num2 is not convertible, reset them to 0.  */
		catch (NumberFormatException nfe) {
			num1.setText("0");
			num2.setText("0");
		}
		
	}
	
	
	public static void main(String[] args) {
		new Calculator2();
	}
	
}
