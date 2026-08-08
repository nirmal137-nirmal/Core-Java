package in.co.corejava.Exception;

public class CheckedException2 {
	public static void main(String[] args) {
		try {
			comapany();
			
		}catch(Exception e)  {
			System.out.println("Exception : " + e.getMessage());
		}
		
		System.out.println("Program End");		
	}

	private static void comapany() throws Exception{
		
		manager();
		
	}

	private static void manager() throws Exception {
		
		employee();
		
	}

	private static void employee() throws Exception {
	
		throw new Exception("Employee Salary Not Found");
		
	}

}
