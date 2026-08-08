package in.co.corejava.Exception;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(1000.00);
		
		System.out.println("Current Balance " +a.getBalance());
		
		a.withdraw(2000.00);
	}

}
