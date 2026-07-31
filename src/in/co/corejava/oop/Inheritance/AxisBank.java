package in.co.corejava.oop.Inheritance;

public class AxisBank extends Bank {
	
	private String accountType;
	private double minimumBalance;
	private String customerCareNo;
	
	
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
	public String getCustomerCareNo() {
		return customerCareNo;
	}
	public void setCustomerCareNo(String customerCareNo) {
		this.customerCareNo = customerCareNo;
	}
	
	

}
