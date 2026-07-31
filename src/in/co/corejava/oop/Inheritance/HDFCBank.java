package in.co.corejava.oop.Inheritance;

public class HDFCBank extends Bank {
	
	private String accountType;
	private double minimumBalance;
	private String netBanking;
	
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public String getNetBanking() {
		return netBanking;
	}
	public void setNetBanking(String netBanking) {
		this.netBanking = netBanking;
	}

}
