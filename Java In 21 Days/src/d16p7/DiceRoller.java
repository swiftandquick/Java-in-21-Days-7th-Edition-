package d16p7;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;

public class DiceRoller extends JFrame implements PropertyChangeListener {

	JTextField[] total = new JTextField[16];
	JButton roll;
	JTextField quantity;

	
	/* DiceWorker is inside DiceRoller but outside of the methods.  */
	public class DiceWorker extends SwingWorker {
		int timesToRoll;
		public DiceWorker(int timesToRoll) {
			super();
			this.timesToRoll = timesToRoll;
		}
		
		@Override
		protected int[] doInBackground() {
			int[] result = new int[16];
			for (int i = 0; i < this.timesToRoll; i++) {
				int sum = 0;
				for (int j = 0; j < 3; j++) {
					sum += Math.floor(Math.random() * 6);
				}
				result[sum] = result[sum] + 1;
			}
			return result; 
		}
	}
	/* Declare the DiceWorker variable after the inner class.  */
	DiceRoller.DiceWorker worker;


	public DiceRoller() {
		super("Dice Roller");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setSize(850, 145);
		
		JPanel topPane = new JPanel();
		GridLayout paneGrid = new GridLayout(1, 16);
		topPane.setLayout(paneGrid);
		for (int i = 0; i < 16; i++) {
			total[i] = new JTextField("0", 4);
			JLabel label = new JLabel((i + 3) + ":  ");
			JPanel cell = new JPanel();
			cell.add(label);
			cell.add(total[i]);
			topPane.add(cell);
		}
		
		JPanel bottomPane = new JPanel();
		JLabel quantityLabel = new JLabel("Times to Roll:  ");
		
		/* Use Lambda expression so I don't have to import ActionListener.  */
		ActionListener act = (event) -> {
			int timesToRoll;
			try {
				timesToRoll = Integer.parseInt(quantity.getText());
				roll.setEnabled(false);
				worker = new DiceWorker(timesToRoll);
				worker.addPropertyChangeListener(this);
				worker.execute();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		};
				
		quantity = new JTextField("0", 5);
		roll = new JButton("Roll");
		
		/* Let the "act", the object with ActionListener instance to handle 
		 * event once I click on roll button.  Write the line below after 
		 * "act" is instantiated.  */
		roll.addActionListener(act);
		bottomPane.add(quantityLabel);
		bottomPane.add(quantity);
		bottomPane.add(roll);

		GridLayout frameGrid = new GridLayout(2, 1);
		setLayout(frameGrid);
		add(topPane);
		add(bottomPane);
		
		setVisible(true);
	}


	public void propertyChange(PropertyChangeEvent event) {
		try {
			int[] result = (int[]) worker.get();
			for (int i = 0; i < result.length; i++) {
				total[i].setText("" + result[i]);
			}
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			roll.setEnabled(true);
		}
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
		new DiceRoller();
	}
	
}
