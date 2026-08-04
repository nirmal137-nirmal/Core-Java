package in.co.corejava.oop.Constructor;

public class TestResult {
	public static void main(String[] args) {
		
		Result r = new Result(101, 001, 97.2, "A+", "Pass");
		
		System.out.println("Result Id : " + r.getResultId());
		System.out.println("Student Id : " + r.getStudentId());
		System.out.println("percentage : " + r.getPercentage());
		System.out.println("grade : " + r.getGrade());
		System.out.println("Result Status : " + r.getResultStatus());
		
		System.out.println("---------------------------------");
		
		Result s = new Result(102,002, 99.1, "A+", "Pass");
		
		System.out.println("Result Id : " + s.getResultId());
		System.out.println("Student Id : " + s.getStudentId());
		System.out.println("percentage : " + s.getPercentage());
		System.out.println("grade : " + s.getGrade());
		System.out.println("Result Status : " + s.getResultStatus());
	}

}
