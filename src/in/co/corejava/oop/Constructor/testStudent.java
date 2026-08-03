package in.co.corejava.oop.Constructor;

public class testStudent {
	
	public static void main(String[] args) {
		
		Student s = new Student("Nirmal", 1001,"Indore" );
		
		System.out.println(s.getName());
		System.out.println(s.getStudentId());
		System.out.println(s.getStundentAddress());
		
		System.out.println("----new Data-----");
		
		Student d = new Student("Bhushan", 1002, "pune");

		System.out.println(d.getName());
		System.out.println(d.getStudentId());
		System.out.println(d.getStundentAddress());
		
	}

}
