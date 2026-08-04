package in.co.corejava.oop.Constructor;

public class Account {

	private String accNumber;
	private String accType;
	private double balance;

	public Account() {
		System.out.println("This is default Constructor");
	}

	public Account(String accNumber, String accType, double balance) {
		this.accNumber = accNumber;
		this.accType = accType;
		this.balance = balance;

	}

	public String getAccNumber() {
		return accNumber;
	}

	public String getAccType() {
		return accType;
	}

	public double getBalance() {
		return balance;
	}
}
