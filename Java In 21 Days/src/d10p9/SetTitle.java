package d10p9;

import javax.swing.*;
import java.awt.*;

public class SetTitle extends JFrame {
	
	public SetTitle() {
		super();
		String title = JOptionPane.showInputDialog(null, "Enter the title:  ");
		setTitle(title);
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new SetTitle();
	}

}
