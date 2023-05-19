package g18.openResearch;

import javax.swing.JFrame;
import javax.swing.JPanel;

import g18.openResearch.login.LoginController;
import g18.openResearch.login.LoginModel;
import g18.openResearch.login.LoginView;

public class MainFrame extends JFrame{
	private static MainFrame instance = new MainFrame();
	
	public MainFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(Size.X.getSize(), Size.Y.getSize());
		
		LoginModel loginModel = new LoginModel();
		LoginView loginView = new LoginView();
		LoginController loginControler = new LoginController(loginModel, loginView);
		this.setContentPane(loginView);
		System.out.println("frame created");
	}
	public static MainFrame getInstance() {
		return instance==null ? new MainFrame() : instance;
	}
	public void changePage(JPanel panel) {
		this.setContentPane(panel);
	}

}
