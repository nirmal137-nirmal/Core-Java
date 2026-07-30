package in.co.corejava.oop.Encapsulation;

import java.util.Date;

public class Insurance {
	
	private int policyId;
	private String policyHolderName;
	private String policyType;
	private int premimumAmount;
	//private Date expiryDate;
	
	public void setPolicyID(int policyId) {
		this.policyId = policyId;
	}
	
	public int getpolictId() {
		return policyId;
		
	}
	
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	
	public String getPolicyType() {
		return policyType;
	}
	
	public void setPremimumAmount(int premimumAmount) {
		this.premimumAmount = premimumAmount;
	}
	
	public int getPremimumAmount() {
		return premimumAmount;
	}
	

}
