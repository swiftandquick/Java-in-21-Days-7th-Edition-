package d11p1;

import javax.swing.*;
import java.awt.*;

public class Alphabet extends JFrame {
	
	public Alphabet() {
		super("Alphabet");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setSize(360, 120);
		/* Sets flow layout with components lean left.  */
		FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
		setLayout(lm);
		JButton a = new JButton("Alibi");
		JButton b = new JButton("Burglar");
		JButton c = new JButton("Corpse");
		JButton d = new JButton("Deadbeat");
		JButton e = new JButton("Evidence");
		JButton f = new JButton("Fugitive");
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
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
		new Alphabet();
	}
	
}
