package d9p5;

import javax.swing.*;

public class FormatFrame extends JFrame {

	/* Creates an array of 4 radio buttons.  */
	JRadioButton[] teams = new JRadioButton[4];
	
	
	public FormatFrame() {
		super("Choose an Output Format");
		setSize(320, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* Set the JRadioButton indices.  */
		teams[0] = new JRadioButton("Atom");
		teams[1] = new JRadioButton("RSS 0.92");
		teams[2] = new JRadioButton("RSS 1.0");
		/* Default selected radio button.  */
		teams[3] = new JRadioButton("RSS 2.0", true);
		
		JPanel panel = new JPanel();
		JLabel chooseLabel = new JLabel("Choose an output format for syndicated news items.  ");
		panel.add(chooseLabel);
		
		/* Create a button group that adds each of the teams element into one group.  
		 * So only one radio button can be selected.  */
		ButtonGroup group = new ButtonGroup();
		for (JRadioButton team : teams) {
			group.add(team);
			panel.add(team);
		}

		add(panel);
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
		FormatFrame.setLookAndFeel();
		new FormatFrame();
	}
	
}
