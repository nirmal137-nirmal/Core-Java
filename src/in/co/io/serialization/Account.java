package in.co.io.serialization;

import java.io.Serializable;

public class Account implements Serializable {

	private int balance;
	private int accountNo;
	private transient int pin;

	public Account(int b, int a, int p) {
		this.balance = b;
		this.accountNo = a;
		this.pin = p;

	}

	@Override
	public String toString() {
		return "balance: " + balance + ", accountNo: " + accountNo + ", pin: " + pin;
	}

}
