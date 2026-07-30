package in.co.corejava.oop.Encapsulation;

public class Branch {
	
	private int branchId;
	private String branchName;
	private String city;
	private String managerName;
	private String contactNo;
	
	public void setBranchId(int branchId) {
		this.branchId = branchId;
		
	}
	
	public int getbranchId() {
		return branchId;
	}
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
		
	}
	
	public String getBranchName() {
		return branchName;
		
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public String getManagerName() {
		return managerName;
	}
	
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public String getContactNo() {
		return contactNo;
	}
	

}
