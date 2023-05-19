package g18.openResearch.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.AbstractMap;

public class LoginController {
	private LoginModel model;
	private LoginView view;
	public LoginController(LoginModel model, LoginView view) {
		this.model = model;
		this.view = view;
		view.addLoginListener(new LoignListener());
		view.addResetListener(new ResetListener());
	
	}
	
	private class LoignListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(model
					.match(
							new AbstractMap.SimpleEntry<String, String>(view.getEnteredUsername(), view.getEnteredPassword()
									))){
				view.loginSuccessfullHandler();
			}
			else {
				view.wrongCredentialsHandler();
			}
		}
		
	}
	private class ResetListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			view.setUsernameValue("");
			view.setPasswordValue("");
			view.clearMessageHandler();
			
		}
		
	}
	

}
