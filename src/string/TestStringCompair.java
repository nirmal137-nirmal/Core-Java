package string;

public class TestStringCompair {
	public static void main(String[] args) {
		
		String s1 = "Nirmal";
		String s2 = "Nirmal";
		
		String s3 = new String ("Fayake");
		String s4 = new String ("Fayake");
		
		System.out.println(s1 == s2);
		System.out.println(s3.equals(s4));
	}

}
