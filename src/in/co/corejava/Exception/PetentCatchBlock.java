package in.co.corejava.Exception;

public class PetentCatchBlock {
	public static void main(String[] args) {
		
		String name = "Nirmal";
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(7));  //Index Out of Bound
		}catch (Exception e) {
			System.out.println("Exception : " +e.getMessage());
		}finally {
			System.out.println("Always execute");
		}
	}

}
