package in.co.corejava.oop.Encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestExam {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Exam e = new Exam();

        e.setExamId(1);
        e.setExamName("Nirmal");
        e.setExamDate(sdf.parse("2026-08-03"));
        e.setTotalMarks(100);
        e.setPassingMarks(33);

        System.out.println("Exam Id : " + e.getExamId());
        System.out.println("Exam Name : " + e.getExamName());
        System.out.println("Exam Date : " + sdf.format(e.getexamDate()));
        System.out.println("Total Marks : " + e.getTotalMarks());
        System.out.println("Passing Marks : " + e.getPassingMarks());
    }
}