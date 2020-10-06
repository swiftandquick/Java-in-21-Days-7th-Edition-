package d11p5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SurveyWizard extends JPanel implements ActionListener {

	/* currentCard value starts at 0, represents index 0 of ask array.  */
	int currentCard = 0;
	CardLayout cards = new CardLayout();
	/* Survey Panel is a subclass of JPanel, there are 3 survey panels in the ask array.  */
	SurveyPanel[] ask = new SurveyPanel[3];
	
	
	public SurveyWizard() {
		super();
		setSize(240, 140);
		/* Set layout to cards, so only one ask (SurveyPanel) will be visible at the time.  */
		setLayout(cards);
		// Set up survey.  
		String question1 = "What is your gender?  ";
		String[] resp1 = { "female", "male", "not telling" };
		/* Passes three String, String[], and int as arguments to SurveyPanel constructor.  
		 * question1 is the question String, resp1 are the options, 2 is the index of the 
		 * pre-selected option, which is "not telling".  */
		ask[0] = new SurveyPanel(question1, resp1, 2);
		String question2 = "What is your age?  ";
		String[] resp2 = { "Under 25", "25-34", "35-54", "Over 54" };
		ask[1] = new SurveyPanel(question2, resp2, 1);
		String question3 = "How oten do you exercise each week?  ";
		String[] resp3 = { "Never", "1-3 times", "More than 3" };
		ask[2] = new SurveyPanel(question3, resp3, 1);
		/* Call addListeners() method.  */
		addListeners();
	}
	
	
	/* Add listener to each card's (SurveyPanel) nextButton(s) and finalButton(s).  
	 * Also, add each card to the SurveyWizard container (JPanel) by giving each 
	 * card a name based on index:  Card 0, Card 1, and Card 2.  */
	private void addListeners() {
		for (int i = 0; i < ask.length; i++) {
			ask[i].nextButton.addActionListener(this);
			ask[i].finalButton.addActionListener(this);
			add(ask[i], "Card " + i);
		}
	}
	

	/* Every time an action is performed on nextButton, currentCard increments by 1.  
	 * If currentCard reaches 2 (ask.length), exits the application.  */
	public void actionPerformed(ActionEvent e) {
		currentCard++;
		if (currentCard >= ask.length) {
			System.exit(0);
		}
		/* Shows the card with matching card name.  */
		cards.show(this,  "Card " + currentCard);
	}
	
}
