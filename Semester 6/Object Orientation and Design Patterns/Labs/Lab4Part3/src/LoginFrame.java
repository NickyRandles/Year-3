import java.awt.*;

import javax.swing.*;


public class LoginFrame extends GreetingDisplay{
	
	JPanel loginPanel;
	JTextField username;
	JPasswordField password;
	JLabel usernameLabel, passwordLabel;
	
	public LoginFrame(){
		panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.add(usernameLabel);
		panel.add(username);
		panel.add(passwordLabel);
		panel.add(password);
		loginFrame.add(panel);
		loginFrame.setSize(300, 300);
		loginFrame.setVisible(true);
	}

}
