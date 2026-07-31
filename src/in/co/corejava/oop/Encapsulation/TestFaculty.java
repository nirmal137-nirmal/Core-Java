package in.co.corejava.oop.Encapsulation;

public class TestFaculty {
	
	public static void main(String[] args) {
		
		Faculty f = new Faculty();
		
		System.out.println("---------Faculty----------");
		
		f.setfacultyId(001);
		f.setFacultyName("Anshul Sir");
		f.setSubject("Java");
		f.setQualification("B.TECH");
		f.setExperience(3);
		
		System.out.println("Faculty Id : " + f.getfacultyId());
		System.out.println("Faculty Name : " + f.getFacultyName());
		System.out.println("Faculty SUbject : " + f.getSubject());
		System.out.println("Qualification : " + f.getQualification());
		System.out.println("Experience : " + f.getExperience());
		
		System.out.println();
		System.out.println("-----------faculty ------------");
		
		Faculty d = new Faculty();
		
		d.setfacultyId(002);
		d.setFacultyName("Uday Sir");
		d.setSubject("Python");
		d.setQualification("B.TECH");
		d.setExperience(3);
		
		System.out.println("Faculty Id : " + d.getfacultyId());
		System.out.println("Faculty Name : " + d.getFacultyName());
		System.out.println("Faculty SUbject : " + d.getSubject());
		System.out.println("Qualification : " + d.getQualification());
		System.out.println("Experience : " + d.getExperience());
	}

}
