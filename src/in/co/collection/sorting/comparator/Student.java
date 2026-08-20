package in.co.collection.sorting.comparator;

public class Student {
	
	public int studentId;
	public String name;
	public String email;
	public String mobileNo;
	public String course;
	
	public Student(int studentId, String name, String email, String mobileNo, String course) {
		this.studentId = studentId;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.course = course;	
		
	}

	@Override
	public String toString() {
		return "studentId=" + studentId + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", course=" + course + "";
	}

}
