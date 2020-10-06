package d12p7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Expunger extends JFrame implements ActionListener {

	public boolean deleteFile;
	
	
	public Expunger() {
		super("Expunger");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel commandLabel = new JLabel("Do you want to delete the file?"  );
		JButton yes = new JButton("Yes");
		JButton no = new JButton("No");

		/* Add action listener to yes and no buttons.  */
		yes.addActionListener(this);
		no.addActionListener(this);
		
		/* Create the layout.  */
		setLayout(new BorderLayout());
		JPanel bottom = new JPanel();
		bottom.add(yes);
		bottom.add(no);
		add("North", commandLabel);
		add("South", bottom);
		pack();
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		/* Default action command is whatever the text label is inside the JButton.  */
		if (source.getActionCommand().contentEquals("Yes")) {
			deleteFile = true;
		}
		else {
			deleteFile = false;
		}
		System.out.println(deleteFile);
	}
	
	
	public static void main(String[] args) {
		new Expunger();
	}
		
}
