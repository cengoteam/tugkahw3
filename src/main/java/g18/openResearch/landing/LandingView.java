package g18.openResearch.landing;

import javax.swing.JLabel;
import javax.swing.JPanel;

import g18.openResearch.BaseView;

public class LandingView extends BaseView{
	private JLabel test;
	public LandingView() {
		super();
		test = new JLabel("landing page");
		test.setBounds(225,225,50,50);
		this.add(test);
	}
	

}
