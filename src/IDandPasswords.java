import java.util.HashMap;

public class IDandPasswords {
	
	HashMap <String, String> logininfo = new HashMap<String, String>();
	
	IDandPasswords(){
		
		logininfo.put("Bro", "bro1");
		logininfo.put("Bro2", "bro2");
		logininfo.put("Bro3", "bro3");
	}
	
	protected HashMap getLoginInfo() {
		
		return logininfo;
		
	}

}
