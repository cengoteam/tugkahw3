package g18.openResearch.login;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import g18.openResearch.BaseView;
import g18.openResearch.MainFrame;
import g18.openResearch.landing.LandingView;

public class LoginView extends BaseView{
	private JLabel usernameLabel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JLabel passwordLabel;
	private JLabel messageLabel;
	private JButton loginButton;
	private JButton resetButton;
	public LoginView() {
		super();
		usernameLabel = new JLabel("Username");
		passwordLabel = new JLabel("Password");
		passwordField = new JPasswordField();
		usernameField = new JTextField();
		messageLabel = new JLabel();
		loginButton = new JButton("login");
		resetButton = new JButton("reset");
		usernameLabel.setBounds(50,100,75,25);
		passwordLabel.setBounds(50,125,75,75);
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		usernameField.setBounds(125,100,200,25);
		passwordField.setBounds(125,150,200,25);
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		resetButton.setBounds(225,200,100,25);
		resetButton.setFocusable(false);
		this.add(usernameLabel);
		this.add(passwordLabel);
		this.add(usernameField);
		this.add(passwordField);
		this.add(loginButton);
		this.add(resetButton);
		this.add(messageLabel);
		
		
		
		
	}
	protected void addLoginListener(ActionListener actionListener) {
		loginButton.addActionListener(actionListener);
	}
	protected void addResetListener(ActionListener actionListener) {
		resetButton.addActionListener(actionListener);
	}
	protected String getEnteredUsername() {
		return usernameField.getText();
	}
	protected String getEnteredPassword() {
		return String.valueOf(passwordField.getPassword());	
	}
	protected void loginSuccessfullHandler() {
		MainFrame.getInstance().changePage(new LandingView());
	}
	protected void wrongCredentialsHandler() {
		messageLabel.setText("Wrong Credentials");
	}
	protected void setUsernameValue(String value) {
		usernameField.setText(value);
	}
	protected void setPasswordValue(String value) {
		passwordField.setText(value);
	}
	protected void clearMessageHandler() {
		messageLabel.setText("");
	}

}
