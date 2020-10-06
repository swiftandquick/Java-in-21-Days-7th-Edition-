package d10p7;

import javax.swing.*;

public class TabPanels extends JFrame {

	JLabel mainLabel = new JLabel("Main tab description...  ");
	JLabel advancedLabel = new JLabel("Advanced tab description...  ");
	JLabel privacyLabel = new JLabel("Privacy tab description...  ");
	JLabel emailLabel = new JLabel("E-mail tab description...  ");
	JLabel securityLabel = new JLabel("Security tab description...  ");
	
	public TabPanels() {
		super("Tabbed Panes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setSize(480, 218);
		/* Creates five panels.  Add the JLabel to each panel to see the effect.  */
		JPanel mainSettings = new JPanel();
		mainSettings.add(mainLabel);
		JPanel advancedSettings = new JPanel();
		advancedSettings.add(advancedLabel);
		JPanel privacySettings = new JPanel();
		privacySettings.add(privacyLabel);
		JPanel emailSettings = new JPanel();
		emailSettings.add(emailLabel);
		JPanel securitySettings = new JPanel();
		securitySettings.add(securityLabel);
		/* Creates a tabbed pane.  */
		JTabbedPane tabs = new JTabbedPane();
		/* Add 5 panels to the tabbed pane, each has a String label.  */
		tabs.addTab("Main", mainSettings);
		tabs.addTab("Advanced", advancedSettings);
		tabs.addTab("Privacy", privacySettings);
		tabs.addTab("E-mail", emailSettings);
		tabs.addTab("Security", securitySettings);
		add(tabs);
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
		new TabPanels();
	}
	
}
