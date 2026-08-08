package in.co.corejava.Exception;

public class LoginException extends RuntimeException {
	
	public LoginException() {
		super("User Not Found!");
	}

}
