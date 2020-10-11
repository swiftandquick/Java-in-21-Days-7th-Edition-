package d16p5;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CursorMayhem extends JFrame {

	JButton harry, wade, hansel;


	public CursorMayhem() {
		super("Choose a Cursor");
		setLookAndFeel();
		setSize(400, 80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		harry = new JButton("Crosshair");
		add(harry);
		wade = new JButton("Wait");
		add(wade);
		hansel = new JButton("Hand");
		add(hansel);

		/* This is a Lambda expression.  Variable act refers to the ActionListener object, 
		 * event refers to ActionEvent object.  In Lambda expression, I don't have to write 
		 * the actionPerformed method then write the codes inside.  */
		ActionListener act = (event) -> {
			if (event.getSource() == harry) {
				setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
			}
			if (event.getSource() == wade) {
				setCursor(new Cursor(Cursor.WAIT_CURSOR));
			}
			if (event.getSource() == hansel) {
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		};

		harry.addActionListener(act);
		wade.addActionListener(act);
		hansel.addActionListener(act);

		setVisible(true);
	}


	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
			// Do nothing.  
		}
	}


	public static void main(String[] args) {
		new CursorMayhem();
	}

}
