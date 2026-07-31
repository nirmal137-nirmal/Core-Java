package in.co.corejava.oop.Encapsulation;

public class Faculty {
	
	private int facultyId;
	private String facultyName;
	private String subject;
	private String qualification;
	private int experience;
	
	
	public void setfacultyId(int facultyId) {
		this.facultyId = facultyId;
		
	}
	
	public int getfacultyId() {
		return facultyId;
	}
	
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
		
	}
	
	public String getFacultyName() {
		return facultyName;
	}
	
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public String getQualification() {
		return qualification;
	}
	
	public void setExperience (int experience) {
		this.experience = experience;
	}
	
	public int getExperience() {
		return experience;
	}

}
