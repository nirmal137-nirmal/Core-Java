package in.co.corejava.Exception;

public class Account {
	
	private double Balance;

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}
	
	public void withdraw(double amount) {
		if (amount > this.Balance) {
			throw new InsufficentFundException();
		}
	}

}
