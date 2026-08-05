package in.co.corejava.oop.Encapsulation;

public class TestSubject {
	
	public static void main(String[] args) {
	
	Subject s = new Subject();
	
	System.out.println("--------Details-----------");
	
	s.setSubjectId(1001);
	s.setSubjectName("Java");
	s.setSubjectCode("Rayss101");
	s.setCredits(3.5);
	s.setSemester("4th Semester");
	
	
	System.out.println("Subject Id : " + s.getSubjectId());
	System.out.println("Subject Name : " + s.getSubjectName());
	System.out.println("Subject Code : " + s.getSubjectCode());
	System.out.println("Subject Credits : " + s.getCredits());
	System.out.println("Semester : " + s.getSemester());
	
	System.out.println();
	System.out.println("-----------Details-----------");

	Subject p = new Subject();
	
	p.setSubjectId(1002);
	p.setSubjectName("Python");
	p.setSubjectCode("Rays102");
	p.setCredits(4);
	p.setSemester("3rd Semester");
	
	System.out.println("Subject Id : " + p.getSubjectId());
	System.out.println("Subject Name : " + p.getSubjectName());
	System.out.println("Subject Code : " + p.getSubjectCode());
	System.out.println("Subject Credits : " + p.getCredits());
	System.out.println("Semester : " + p.getSemester());
	
	
	}

}
