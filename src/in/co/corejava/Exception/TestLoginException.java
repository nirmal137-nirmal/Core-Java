package in.co.corejava.Exception;

public class TestLoginException {
	public static void main(String[] args) {
		
		String login = "admin123";
		
		if(login == "admin") {
			System.out.println("User Found");
		}else {
			try {
				throw new LoginException();
			}catch (LoginException e) {
				System.out.println("Exception :" + e.getMessage());
				// TODO: handle exception
			}
		}
	}

}
