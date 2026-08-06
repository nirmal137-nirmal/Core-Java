package in.co.corejava.oop.Encapsulation;

public class Student {

	private int studentID;
	private String studentName;
	private String course;
	private double fees;
	
	public Student(int studentId, String studentName, String course, double fees) {
		this.studentID = studentId;
		this.studentName = studentName;
		this.course = course;
		this.fees = fees;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

}
