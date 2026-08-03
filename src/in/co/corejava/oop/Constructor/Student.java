package in.co.corejava.oop.Constructor;

public class Student {

	private String name;
	private int studentId;
	private String stundentAddress;

	public Student() {
		System.out.println("This is default constructor");
	}

	public Student(String name, int studentId, String studentAddress) {
		this.name = name;
		this.studentId = studentId;
		this.stundentAddress = studentAddress;

	}

	public String getName() {
		return name;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStundentAddress() {
		return stundentAddress;
	}

}
