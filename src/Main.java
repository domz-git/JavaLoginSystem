
public class Main {

	public static void main(String[] args) {
		
		IDandPasswords idandpass = new IDandPasswords();
		
		LoginPage loginpage = new LoginPage(idandpass.getLoginInfo());

	}

}
