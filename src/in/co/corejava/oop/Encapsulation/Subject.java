package in.co.corejava.oop.Encapsulation;

public class Subject {
	
	private int subjectId;
	private String subjectName;
	private String subjectCode;
	private double credits;
	private String semester;
	
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	
	public void setCredits(double credits) {
		this.credits = credits;
	}
	
	public double getCredits() {
		return credits;
	}
	
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}

}
