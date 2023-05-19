package g18.openResearch.login;

import java.util.HashMap;
import java.util.Map;

public class LoginModel {
	
	private Map<String,String> credentials;
	public LoginModel() {
		credentials = new HashMap<>();
		credentials.put("cagatay", "123");
		credentials.put("admin", "123");
	}
	protected boolean match(Map.Entry<String, String> credential) {
		return credentials.entrySet().contains(credential);
	}
	

}
