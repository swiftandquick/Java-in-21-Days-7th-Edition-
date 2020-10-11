package d14p1;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;

/* A frame that holds the graphical user interface.  
 * PropertyListener:  A "PropertyChange" event gets fired whenever a bean changes a "bound"property.  
 * Row 3 dice, see how frequent each result is.  */
public class DiceRoller extends JFrame implements ActionListener, PropertyChangeListener {

	// Declare 16 JTextField.  total stands for how many times
	JTextField[] total = new JTextField[16];
	// The "Roll" button.  
	JButton roll;
	// Number of times to roll.  
	JTextField quantity;
	// The Swing worker/  
	DiceWorker worker;


	/* Constructor.  Invoked by anonymous DiceRoller object from main method.  */
	public DiceRoller() {
		super("Dice Roller");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setSize(850, 145);
		
		// Set up top row.  
		JPanel topPane = new JPanel();
		/* Layout is one row with 16 columns.  */
		GridLayout paneGrid = new GridLayout(1, 16);
		topPane.setLayout(paneGrid);
		for (int i = 0; i < 16; i++) {
			// Create 16 JTxtField with maximum input of 4 characters.  
			total[i] = new JTextField("0", 4);
			/* The minimum value of rolling 3 dice is 3, so first label is 3.  */
			JLabel label = new JLabel((i + 3) + ":  ");
			/* JPanel (cell) inside a JPanel (topPane), the cell panel contains 
			 * the current label (JLabel) and the current total index (JTextField).  */
			JPanel cell = new JPanel();
			cell.add(label);
			cell.add(total[i]);
			// Add each cell to the top row.  
			topPane.add(cell);
		}
		
		// Set up bottom row.  No layout being set means bottomPanel has FlowLayout by default.  
		JPanel bottomPane = new JPanel();
		JLabel quantityLabel = new JLabel("Times to Roll:  ");
		/* Set quantity to a text field with 5 characters input maximum.  */
		quantity = new JTextField("0", 5);
		roll = new JButton("Roll");
		/* Invokes events the "Roll" button is clicked.  */
		roll.addActionListener(this);
		bottomPane.add(quantityLabel);
		bottomPane.add(quantity);
		bottomPane.add(roll);

		/* The main frame layout has two rows, one for topPane, other for bottomPane.  */
		GridLayout frameGrid = new GridLayout(2, 1);
		setLayout(frameGrid);
		add(topPane);
		add(bottomPane);
		
		setVisible(true);
	}
	
	
	/* Responds when the "Roll" button is clicked.  Since there is only one component has 
	 * that has action listener, so there is no need to use methods like getSource().  */
	public void actionPerformed(ActionEvent event) {
		int timesToRoll;
		try {
			// Translate the current text input of quantity in integer form.  
			timesToRoll = Integer.parseInt(quantity.getText());
			// Turns off the button once it's clicked.  
			roll.setEnabled(false);
			// Set up the worker that will roll the dice.  
			worker = new DiceWorker(timesToRoll);
			// Add a listener that monitors the worker.  
			worker.addPropertyChangeListener(this);
			// Start the worker.  
			worker.execute();
		}
		/* If the text from quantity cannot be converted to a number, 
		 * then the error will be caught here.  */
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	

	// Respond when the worker's (SwingWorker's subclass) task is complete.  
	public void propertyChange(PropertyChangeEvent event) {
		try {
			/* Get the worker's dice-roll results by retrieving result from SwingWorker 
			 * via get().  Cast the result as an int[] array.  */
			int[] result = (int[]) worker.get();
			/* Since result array from DiceWorker has 16 indexes, which means result 
			 * array in this method has 16 indexes as well. Set the text of each of total's 
			 * 16 indexes to the corresponding result indexes.  */
			for (int i = 0; i < result.length; i++) {
				total[i].setText("" + result[i]);
			}
		}
		// If worker.get() cannot be casted as int, which is impossible, then catch the error.  
		catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// Re-enable the application in the end.  
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
