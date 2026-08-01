package in.co.corejava.oop.Encapsulation;

public class TestDepartment {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("-----------Department Details-------------");
		
		
		Department d = new Department();
		
		d.setDepartmentId(01);
		d.setDepartmentName("Computer Application");
		d.setHodName("Sourabh Jain");
		d.setTotalFaculty(27);
		d.setLocation("Indore");
		
		System.out.println("Department Id : " +d.getDepartmentId());
		System.out.println("Department Name : " +d.getDepartmentName());
		System.out.println("HOD Name : " +d.getHodName());
		System.out.println("Total Faculty NO. : " +d.getTotalFaculty());
		System.out.println("Location  : " +d.getLocation());
		
	}

}
