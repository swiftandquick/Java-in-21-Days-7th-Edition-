package d11p5;

import java.awt.*;
import javax.swing.*;

public class SurveyPanel extends JPanel {

	/* Current question.  */
	JLabel question;
	/* Responses in the form of radio buttons.  */
	JRadioButton[] response;
	/* Next button and finish button.  */
	JButton nextButton = new JButton("Next");
	JButton finalButton = new JButton("Finish");
	
	
	/* Each time SurveyPanel() is called, three arguments in form of 
	 * String, String[], and int are pass to the constructor.  */
	public SurveyPanel(String ques, String[] resp, int def) {
		super();
		setSize(160, 110);
		
		/* Displays the current question.  */
		question = new JLabel(ques);
		
		/* The response array has elements equal to resp's array length.  */
		response = new JRadioButton[resp.length];
		JPanel sub1 = new JPanel();
		/* Top panel displays the question.  */
		JLabel quesLabel = new JLabel(ques);
		sub1.add(quesLabel);

		/* Create a button group for the radio buttons later so only 1 button could be chosen at the time.  */
		ButtonGroup group = new ButtonGroup();
		
		/* Middle panel displays the radio buttons, and add radio button to the button group.  
		 * Set default response to resp[def], def is the int variable from the constructor.  */
		JPanel sub2 = new JPanel();
		for (int i = 0; i < resp.length; i++) {
			if (def == i) {
				response[i] = new JRadioButton(resp[i], true);
			}
			else {
				response[i] = new JRadioButton(resp[i], false);
			}
			group.add(response[i]);
			sub2.add(response[i]);
		}
		
		/* Bottom panel has next button and final button.  finalButton is disabled.  */
		JPanel sub3 = new JPanel();
		nextButton.setEnabled(true);
		sub3.add(nextButton);
		finalButton.setEnabled(false);
		sub3.add(finalButton);
		
		/* Set layout of the SurveyPanel to grid layout with 3 rows, 1 colum per row.  
		 * Add all three panels to the layout.  */
		GridLayout grid = new GridLayout(3, 1);
		setLayout(grid);
		add(sub1);
		add(sub2);
		add(sub3);
	}
	
	
	public void getFinalQuestion(boolean finalQuestion) {
		if (finalQuestion) {
			nextButton.setEnabled(false);
			finalButton.setEnabled(true);
		}
	}
	
}
