package in.co.corejava.oop.Encapsulation;

public class TestStudent {
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Nirmal", "Java", 25000);
		
		System.out.println("Student Id : " +s1.getStudentID());
		System.out.println("Student Name :" +s1.getStudentName());
		System.out.println("Course : " +s1.getCourse());
		System.out.println("Fees : " +s1.getFees());
		
		System.out.println("----------------------");
		System.out.println();
		
		Student s2 = new Student(102, "Jay", "Python", 42000);
		
		System.out.println("Student Id : " +s2.getStudentID());
		System.out.println("Student Name :" +s2.getStudentName());
		System.out.println("Course : " +s2.getCourse());
		System.out.println("Fees : " +s2.getFees());
	}

}
