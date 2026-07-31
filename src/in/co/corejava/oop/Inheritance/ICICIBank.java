package in.co.corejava.oop.Inheritance;

public class ICICIBank extends Bank{
	
	private String accountType;
	private double minimumBalance;
	private String  mobileBanking;
	
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
	public String getMobileBanking() {
		return mobileBanking;
	}
	public void setMobileBanking(String mobileBanking) {
		this.mobileBanking = mobileBanking;
	}
}
