package d11p5;

import javax.swing.*;
import java.awt.*;

public class SurveyFrame extends JFrame {

	public SurveyFrame() {
		super("Survey");
		setSize(290, 140);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		/* Add the SurveyWizard (JPanel's subclass) to the main frame.  */
		SurveyWizard wiz = new SurveyWizard();
		add(wiz);
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
		new SurveyFrame();
	}
	
}
