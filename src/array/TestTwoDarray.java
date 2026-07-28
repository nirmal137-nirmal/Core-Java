package array;

public class TestTwoDarray {
	public static void main(String[] args) {
		
		String [][] str = new String[2][3];
		
		str [0][0] = "Nirmal";
		str [0][1] = "Abhishek";
		str [0][2] = "Nayan";
		
		str [1][0] = "Dipesh";
		str [1][1] = "Bhushan";
		str [1][2] = "Vinay";
		
		System.out.println(str[0][2]);
		System.out.println(str[1][0]);
	}
}
