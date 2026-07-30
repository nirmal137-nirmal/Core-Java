package in.co.corejava.oop.Encapsulation;

public class CollegeModule {
	
	private int collegeId;
	private String collegeName;
	private String collegeCity;
	private String university;
	private String contactNo;
	
	// college Id
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	
	public int getCollegeId() {
		return collegeId;
		
	}
	
	// college Name
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	// college City
	public void setCollegeCity(String collegeCity) {
		this.collegeCity = collegeCity;
	}
	
	public String getCollegeCity() {
		return collegeCity;
	}
	
	//college University
	public void setUniversity(String university) {
		this.university = university;
	}
	
	public String getUniversity() {
		return university;
	}
	
	// contactNo.
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public String getContactNo() {
		return contactNo;
	}

}
