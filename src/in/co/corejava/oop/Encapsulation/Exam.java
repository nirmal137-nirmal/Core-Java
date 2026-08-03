package in.co.corejava.oop.Encapsulation;

import java.util.Date;

public class Exam {
	
	private int examId;
	private String examName;
	private Date examDate;
	private int totalMarks;
	private int passingMarks;
	
	
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	
	public Date getexamDate() {
		return examDate;
	}
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	public int getPassingMarks() {
		return passingMarks;
	}
	public void setPassingMarks(int passingMarks) {
		this.passingMarks = passingMarks;
	}

}
