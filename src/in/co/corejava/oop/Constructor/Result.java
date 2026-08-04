package in.co.corejava.oop.Constructor;

public class Result {

	private int resultId;
	private int studentId;
	private double percentage;
	private String grade;
	private String resultStatus;

	public Result() {
		// TODO Auto-generated constructor stub
		System.out.println("This is Default Constructor");
	}

	public Result(int resultId, int studentId, double percentage, String grade, String resultStatus) {
		this.resultId = resultId;
		this.studentId = studentId;
		this.percentage = percentage;
		this.grade = grade;
		this.resultStatus = resultStatus;
	}

	public int getResultId() {
		return resultId;
	}

	public int getStudentId() {
		return studentId;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getGrade() {
		return grade;
	}

	public String getResultStatus() {
		return resultStatus;
	}

}
