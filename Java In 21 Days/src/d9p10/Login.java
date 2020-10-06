package d9p10;

import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {

	JLabel usernameL = new JLabel("Username:  ");
	JTextField usernameF = new JTextField(20);
	JLabel passwordL = new JLabel("Password:  ");
	JPasswordField passwordF = new JPasswordField(20);
	JButton login = new JButton("Login");
	
	public Login() {
		super("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		
		JPanel username = new JPanel();
		username.setLayout(new FlowLayout());
		username.add(usernameL);
		username.add(usernameF);
		add(username);
		
		JPanel password = new JPanel();
		password.setLayout(new FlowLayout());
		password.add(passwordL);
		password.add(passwordF);
		add(password);
		
		add(login);
		
		pack();
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Login();
	}
	
}
