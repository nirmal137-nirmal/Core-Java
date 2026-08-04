package in.co.corejava.oop.Polymorphism;

public class TestEmployeeDetails {
	
	public static void main(String[] args) {
		
		Employee[] emp = new Employee[3];
		
		emp[0] = new Developer();
		emp[1] = new Tester();
		emp[2] = new Manager();	
		//Abstract Method
		EmployeeDetails(emp);
		
	}

	private static void EmployeeDetails(Employee[] emp) {
		// TODO Auto-generated method stub
			for (Employee employee : emp) {
				String name = employee.getDepartment();
				double calculateSalary = employee.calculateSalary();
				System.out.println(name +" = " + calculateSalary);
				
			}
	}

	
	

}
