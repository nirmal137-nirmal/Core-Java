package in.co.corejava.oop.Encapsulation;

public class Department {
	
	private int departmentId;
	private String departmentName;
	private String hodName;
	private int totalFaculty;
	private String location;
	
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;	
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}
	public String getHodName() {
		return hodName;
	}
	
	public void setTotalFaculty(int totalFaculty) {
		this.totalFaculty = totalFaculty;
	}
	
	public int getTotalFaculty() {
		return totalFaculty;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
		
	}
}
